package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number  :");
        int number = input.nextInt();
        System.out.println("Enter a number :");
        int number1 = input.nextInt();
        System.out.println("Enter a height :");
        int height = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (j > height - i && j < height + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
