package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.service.Service;

import java.util.Scanner;

public class TransportServiceImpl implements Service {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.print(" Nhập biển kiểm soát :");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void read() {

    }
}
