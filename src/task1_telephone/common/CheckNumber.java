package task1_telephone.common;

import java.util.Scanner;

public class CheckNumber {
    public static int checkInteger() {
        Scanner input = new Scanner(System.in);
        int value;
        do {
            try {
                value = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(" Nhập lại ");
            }

        } while (true);
        return value;

    }

}