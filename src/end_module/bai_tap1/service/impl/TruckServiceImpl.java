package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.models.Truck;
import end_module.bai_tap1.service.TruckService;
import ss9_array_list.bai_tap.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public  class TruckServiceImpl implements TruckService {
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
       trucks.add(new Truck(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,taiTrong));
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void read() {
        System.out.println("Danh sach xe tải");
        for (Truck truck:trucks
             ) {

        }

    }

    @Override
    public void load() {

    }
}
