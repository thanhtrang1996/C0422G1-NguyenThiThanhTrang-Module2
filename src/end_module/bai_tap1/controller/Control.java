package end_module.bai_tap1.controller;
import end_module.bai_tap1.service.CarService;
import end_module.bai_tap1.service.MotorcycleService;
import end_module.bai_tap1.service.TruckService;
import end_module.bai_tap1.service.impl.CarServiceImpl;
import end_module.bai_tap1.service.impl.MotorcycleServiceImpl;
import end_module.bai_tap1.service.impl.TruckServiceImpl;

import java.util.Scanner;

public class Control {
    private static CarService carService = new CarServiceImpl();
    private static MotorcycleService motorcycleService = new MotorcycleServiceImpl();
    private static TruckService truckService = new TruckServiceImpl();

    public static void display() {

        int chon;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println(
                    "\n 1.Thêm mới phương tiện " +
                            "\n 2.Hiển thị phương tiện " +
                            "\n 3.Xoá phương tiện " +
                            "\n 4.Tìm kiếm theo biển kiểm soát  " +
                            "\n 5.Thoát");
            System.out.println("Chọn chức năng : ");
            Scanner input = new Scanner(System.in);
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    themMoiPhuongTien();
                case 2:
                    hienThiPhuongTien();
                case 3:
                    xoaPhuongTien();
                case 4:
                case 5:
                    System.out.println("Kết thúc chương trình");
                default:
                    System.out.println("Xin mời bạn chọn lại");
            }
        } while (chon != 5);

    }

    public static void themMoiPhuongTien() {
        int chon;
        do {
            System.out.println("Thêm phương tiện");
            System.out.println("1.Thêm xe tải" +
                    "\n 2.Thêm oto" +
                    "\n 3. Thêm xe máy" +
                    "\n 4.Thoát");
            System.out.println("Chọn phương tiện muốn thêm");
            Scanner input = new Scanner(System.in);
            chon = Integer.parseInt(input.nextLine());

            switch (chon) {
                case 1:
                    truckService.add();
                    break;
                case 2:
                    carService.add();
                    break;
                case 3:
                    motorcycleService.add();
                    break;
                case 4:
                    System.out.println("Kết thúc thêm mới");
                default:
                    System.out.println("Chọn lại phương tiện bạn muốn thêm");
            }
        } while (chon != 4);

    }

    public static void hienThiPhuongTien() {
        int chon;
        do {
            System.out.println("Hiển thi phương tiện");
            System.out.println("1.Hiện xe tải" +
                    "\n 2.Hiện oto" +
                    "\n 3. Hiện xe máy" +
                    "\n 4.Thoát");
            System.out.println("Chọn phương tiện muốn hiển thị");
            Scanner scanner = new Scanner(System.in);
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    truckService.read();
                    break;
                case 2:
                    carService.read();
                    break;
                case 3:
                    motorcycleService.read();
                    break;
                case 4:
                    System.out.println("Kết thúc hiển thị");
                    break;
                default:
                    System.out.println("Nhập lại phương tiện bạn muốn hiển  thị");
            }
        } while (chon != 4);
    }

    public static void xoaPhuongTien() {

    }

    public static void timPhuongTien() {

    }
}
