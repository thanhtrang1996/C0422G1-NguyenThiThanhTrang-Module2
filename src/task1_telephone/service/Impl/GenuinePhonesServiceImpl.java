package task1_telephone.service.Impl;

import task1_telephone.common.Check;
import task1_telephone.common.CheckManufacturer;
import task1_telephone.common.CheckName;
import task1_telephone.common.CheckNumber;
import task1_telephone.models.GenuinePhones;
import task1_telephone.models.Phone;
import task1_telephone.service.GenuinePhonesService;
import task1_telephone.until.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static task1_telephone.models.Phone.getCountId;

public class GenuinePhonesServiceImpl implements GenuinePhonesService {
    private static final String FILE_GENUINE_PHONE = "src/task1_telephone/data/DataGenuinePhone.csv";

    @Override
    public void add() {
        List<GenuinePhones> genuinePhonesList = ReadAndWriteToCSV.readGenuinePhones(FILE_GENUINE_PHONE);
        Scanner scanner = new Scanner(System.in);
        if (genuinePhonesList.isEmpty()) {
            Phone.setCountId(1);
        } else {
            int max = genuinePhonesList.get(0).getId();
            for (GenuinePhones genuinePhones : genuinePhonesList) {
                if (max < genuinePhones.getId()) {
                    max = genuinePhones.getId();
                }
            }
            Phone.setCountId(max);
            if (getCountId() == null) {
                Phone.setCountId(1);
            } else {
                Phone.setCountId(Phone.getCountId() + 1);
            }
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

        int thoiGianBaoHanh;
        boolean flag = true;
        do {
            System.out.println("Nhập thời gian bảo hành");
            thoiGianBaoHanh = CheckNumber.checkInteger();
            if (thoiGianBaoHanh > 730) {
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);

        String phamViBaoHanh = Check.phamVi();
        genuinePhonesList.add(new GenuinePhones(getCountId(), name, price, soLuong, manufacturer, thoiGianBaoHanh, phamViBaoHanh));
        ReadAndWriteToCSV.writeGenuinePhones(FILE_GENUINE_PHONE, genuinePhonesList, false);
    }
    @Override
    public void delete() {
        List<GenuinePhones> genuinePhonesList = ReadAndWriteToCSV.readGenuinePhones(FILE_GENUINE_PHONE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id ban muon xoa");
        int id = CheckNumber.checkInteger();
        for (int i = 0; i < genuinePhonesList.size(); i++) {
            if (id == genuinePhonesList.get(i).getId()) {
                do {
                    System.out.println("ban chac chan muon xoa" +
                            "\n 1.Yes" +
                            "\n 2. No");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println(genuinePhonesList.get(i));
                            genuinePhonesList.remove(i);
                            ReadAndWriteToCSV.writeGenuinePhones(FILE_GENUINE_PHONE, genuinePhonesList, false);
                            return;
                        case "2":
                            System.out.println("ban da huy xoa");
                            return;
                        default:
                            System.out.println("NHAP LAI");
                    }
                } while (true);
            }
        }
    }

    @Override
    public void display() {
        List<GenuinePhones> genuinePhonesList = ReadAndWriteToCSV.readGenuinePhones(FILE_GENUINE_PHONE);
        if (!genuinePhonesList.isEmpty()) {
            for (GenuinePhones genuinePhone : genuinePhonesList) {
                System.out.println(genuinePhone);
            }
        } else {
            System.out.println("khong co du lieu");
        }
    }

    @Override
    public void search() {
        List<GenuinePhones> genuinePhonesList = ReadAndWriteToCSV.readGenuinePhones(FILE_GENUINE_PHONE);
        List<GenuinePhones> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten ban muon tim kiem --- viet hoa het");
        String name = scanner.nextLine();
        if (!genuinePhonesList.isEmpty()) {
            for (GenuinePhones genuinePhones : genuinePhonesList) {
                if (genuinePhones.getPhoneName().contains(name)) {
                    System.out.println(genuinePhones);
                    result.add(genuinePhones);
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
