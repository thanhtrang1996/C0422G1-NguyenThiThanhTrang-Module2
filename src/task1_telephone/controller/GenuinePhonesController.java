package task1_telephone.controller;

import task1_telephone.common.CheckNumber;
import task1_telephone.service.GenuinePhonesService;
import task1_telephone.service.Impl.GenuinePhonesServiceImpl;

public class GenuinePhonesController {
    private static GenuinePhonesService genuinePhonesService;

    public static void displayGenuinePhones() {
        int chon;
        do {
            genuinePhonesService = new GenuinePhonesServiceImpl();
            System.out.println("Chọn chức năng\n" +
                    "1. Thêm điện thoại chính hãng\n" +
                    "2.Xoá điện thoại chính hãng\n" +
                    "3.Hiển thị danh sách điện thoại chính hãng\n" +
                    "4.Tìm kiếm điện thoại chính hãng\n" +
                    "5. Quay lại màn hình chính"
            );
            System.out.println("Chọn chức năng");
            chon = CheckNumber.checkInteger();
            switch (chon) {
                case 1:
                    genuinePhonesService.add();
                    break;
                case 2:
                    genuinePhonesService.delete();
                    break;
                case 3:
                    genuinePhonesService.display();
                    break;
                case 4:
                    genuinePhonesService.search();
                    break;
                case 5:
                    return;
                case 6:
                    System.out.println("Nhập lại");
            }
        } while (true);
    }

    public static void main(String[] args) {
        displayGenuinePhones();
    }
}
