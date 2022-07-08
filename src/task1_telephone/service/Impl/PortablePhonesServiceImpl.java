package task1_telephone.service.Impl;

import task1_telephone.common.Check;
import task1_telephone.common.CheckManufacturer;
import task1_telephone.common.CheckName;
import task1_telephone.common.CheckNumber;
import task1_telephone.models.GenuinePhones;
import task1_telephone.models.Phone;
import task1_telephone.models.PortablePhones;
import task1_telephone.service.PortablePhonesService;
import task1_telephone.until.ReadAndWriteToCSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static task1_telephone.models.Phone.getCountId;


public class PortablePhonesServiceImpl implements PortablePhonesService {
    private static final String FILE_PORTABLE_PHONES = "src/task1_telephone/data/DataPortablePhones.csv";

    @Override
    public void add() {
        List<PortablePhones> portablePhones = ReadAndWriteToCSV.readPortablePhones(FILE_PORTABLE_PHONES);
        Scanner scanner = new Scanner(System.in);
//        int id;
//        if (portablePhones.isEmpty()) {
//            id = 1;
//        } else {
//            boolean flag;
//            do {
//                id = Integer.parseInt(String.valueOf(portablePhones.get(portablePhones.size() - 1).getId())) + 1;
//                for (PortablePhones portablePhone : portablePhones) {
//                    if (Integer.parseInt(String.valueOf(portablePhone.getId())) == id) {
//                        id++;
//                        flag = true;
//                    }
//                }
//            } while (true);
//        }
        if (portablePhones.isEmpty()) {
            Phone.setCountId(1);
        } else {
            int max = portablePhones.get(0).getId();
            for (PortablePhones portablePhones1 : portablePhones) {
                if (max < portablePhones1.getId()) {
                    max = portablePhones1.getId();
                }
            }
            Phone.setCountId(max);
            if (getCountId() == null) {
                Phone.setCountId(1);
            } else {
                Phone.setCountId(Phone.getCountId() + 1);
            }
            String name = null;
            do {
                System.out.println("Nhập tên điện thoại---tất cả phải viết hoa");
                name = scanner.nextLine();
            } while (!CheckName.checkName(name));
            System.out.println("Nhập giá tiền----là số dương");
            int price = CheckNumber.checkInteger();
            System.out.println("Nhập số lượng");
            int soLuong = CheckNumber.checkInteger();
            String manufacturer = null;
            do {
                System.out.println("Nhập tên nhà sản xuất---- chữ cái đầu tiên viết hoa");
                manufacturer = scanner.nextLine();
            } while (!CheckManufacturer.checkManufacturer(manufacturer));
            System.out.println("Quoc gia xach tay");
            String quocGiaXachTay = scanner.nextLine();
            String tinhTrang = Check.tinhTrang();
            portablePhones.add(new PortablePhones(getCountId(), name, price, soLuong, manufacturer, quocGiaXachTay, tinhTrang));
            ReadAndWriteToCSV.writePortablePhones(FILE_PORTABLE_PHONES, portablePhones, false);
        }
    }
    @Override
    public void delete() {
        List<PortablePhones> portablePhones = ReadAndWriteToCSV.readPortablePhones(FILE_PORTABLE_PHONES);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id ban muon xoa");
        int id = CheckNumber.checkInteger();
        for (int i = 0; i < portablePhones.size(); i++) {
            if (id == portablePhones.get(i).getId()) {
                do {
                    System.out.println("ban chac chan muon xoa" +
                            "\n 1.Yes" +
                            "\n 2. No");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println(portablePhones.get(i));
                            portablePhones.remove(i);
                            ReadAndWriteToCSV.writePortablePhones(FILE_PORTABLE_PHONES, portablePhones, false);
                            return;
                        case "2":
                            System.out.println("ban da huy xoa");
                            return;
                        default:
                            System.out.println("NHAP LAI");
                    }
                } while (true);
            } else if (id != portablePhones.get(i).getId()){
                try {
                    throw new FileNotFoundException("KHONG TIM THAY TEN");
                } catch (FileNotFoundException e) {
                    System.out.println(" khong tim thay xin moi nhap lai");
                    break;
                }
            }
        }
    }

    @Override
    public void display() {
        List<PortablePhones> portablePhonesList = ReadAndWriteToCSV.readPortablePhones(FILE_PORTABLE_PHONES);
        if (!portablePhonesList.isEmpty()) {
            for (PortablePhones portablePhones : portablePhonesList) {
                System.out.println(portablePhones);
            }
        } else {
            System.out.println("khong co du lieu");
        }
    }
    @Override
    public void search() {
        List<PortablePhones> portablePhonesList = ReadAndWriteToCSV.readPortablePhones(FILE_PORTABLE_PHONES);
        List<PortablePhones> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten ban muon tim kiem --- viet hoa het");
        String name = scanner.nextLine();
        if (!portablePhonesList.isEmpty()) {
            for (PortablePhones portablePhones : portablePhonesList) {
                if (portablePhones.getPhoneName().contains(name)) {
                    System.out.println(portablePhones);
                    result.add(portablePhones);
                }
            }
            if (result.isEmpty()) {
                System.out.println("tên bạn tìm ko có");
            }
        } else {
            System.out.println("file chưa có phần tử");
        }
    }
}

