package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class LapSoHinhThoi {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 6 - i || j == 5 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");


                }
            }
            System.out.println();
        }
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=10; j++) {
                if (j == 6 - i || j == 5 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}