package ss14_debug.bai_tap;

import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.print("Nhập độ dài của cạnh a :");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập độ dài của cạnh b:");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập độ dài của cạnh c :");
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);

            } catch (NumberFormatException | IllegalTriangle e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }while (flag);
    }
}