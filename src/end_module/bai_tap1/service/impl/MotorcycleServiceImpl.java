package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.models.Motorcycle;
import end_module.bai_tap1.service.MotorcycleService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorcycleServiceImpl implements MotorcycleService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Motorcycle> motorcycles = new ArrayList<>();
    @Override
    public void power() {

    }

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
        System.out.print("Nhập công suất :");
        float congSuat = Float.parseFloat(scanner.nextLine());

motorcycles.add(new Motorcycle(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congSuat));

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void read() {
        System.out.println("Hiện danh sách của xe máy ");
        for (Motorcycle motorcycle:motorcycles
             ) {
            System.out.println(motorcycle);

        }
    }
}
