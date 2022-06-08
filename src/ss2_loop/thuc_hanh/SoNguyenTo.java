package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "is not a prime");
        } else {
            boolean check = true;
            for (byte i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " :is a prime");
            } else {
                System.out.println(number + " :is not a prime");
            }
        }
    }
}