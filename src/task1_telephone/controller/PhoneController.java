package task1_telephone.controller;


import task1_telephone.common.CheckNumber;

import java.util.Scanner;

public class PhoneController {
    public static void phoneController() {
        boolean flag = true;
        do {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI---\n" +
                    "1.Điên thoại chính hãng\n"+
                    "2.Điên thoại xách tay");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                  GenuinePhonesController.displayGenuinePhones();
                  break;
                case 2:
                    PortablePhonesController.displayPortablePhones();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("choose again");
            }

        } while (flag);

    }
}