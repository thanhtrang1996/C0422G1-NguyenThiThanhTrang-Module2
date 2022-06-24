package end_module.bai_tap1.controller;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {

        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println(
                    "\n 1.Thêm mới phương tiện " +
                            "\n 2.Hiển thị phương tiện " +
                            "\n 3.Xoá phương tiện " +
                            "\n 4.Tìm kiếm theo biển kiểm soát  " +
                            "\n 5.Thoát");
            Scanner input = new Scanner(System.in);
            System.out.println("Chọn chức năng : ");
            int chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    themMoiPhuongTien();
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    flag = false;
            }
        } while (flag);

    }
    public static void themMoiPhuongTien(){
        boolean flag = true;
        do{
            System.out.println("Thêm phương tiện");
            System.out.println("1.Thêm xe tải" +
                    "\n 2.Thêm oto" +
                    "\n 3. Thêm xe máy");
        }while (flag);

    }
}