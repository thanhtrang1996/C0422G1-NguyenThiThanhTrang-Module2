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
        System.out.println("Nhập biển kiểm soát");
        int bienKiemSoat = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i <motorcycles.size() ; i++) {

            if (motorcycles.get(i).getBienKiemSoat()== bienKiemSoat){
                System.out.println("Bạn thực sự nuốn xoá");
                boolean confirm = Boolean.parseBoolean(scanner.nextLine());
                if(confirm){ motorcycles.remove(i);
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
        System.out.println("Hiện danh sách của xe máy ");
        for (Motorcycle motorcycle:motorcycles
             ) {
            System.out.println(motorcycle);

        }
    }
}
