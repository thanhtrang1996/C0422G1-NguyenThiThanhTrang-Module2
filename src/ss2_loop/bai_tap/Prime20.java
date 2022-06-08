package ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            int total = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    total++;
                    break;
                }

            }
            if (total == 0) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}

