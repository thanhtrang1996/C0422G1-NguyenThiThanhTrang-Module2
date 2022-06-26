package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.models.Truck;
import end_module.bai_tap1.service.TruckService;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImpl implements TruckService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Truck> trucks = new ArrayList<>();

    @Override
    public void add() {
        System.out.print(" Nhập biển kiểm soát :");
        int bienKiemSoat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng");
        float taiTrong = Float.parseFloat(scanner.nextLine());
        trucks.add(new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong));
    }

    @Override
    public void delete() {
        System.out.println("Nhập biển kiểm soát");
        int bienKiemSoat = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i <trucks.size() ; i++) {

            if (trucks.get(i).getBienKiemSoat()== bienKiemSoat){
                System.out.println("Bạn thực sự nuốn xoá");
                boolean confirm = Boolean.parseBoolean(scanner.nextLine());
                if(confirm){ trucks.remove(i);
                    System.out.println("Xoá thành công");
                    return;
                }
            }

        }
        if (!flag){
            System.out.println("Biển kiểm soát không tồn tại");
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void read() {
        System.out.println("Danh sach xe tải");
        for (Truck truck : trucks
        ) {
            System.out.println(truck);
        }
    }

    @Override
    public void load() {

    }
}
