package ss14_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử bất kỳ ");

        try {
            int x = scanner.nextInt();
            System.out.println("Giá trị của phần tử bất kỳ" + x + "là" + arr[x]);

        } catch (Exception e) {
            System.out.println("Vượt quá giới hạn của mảng");
        }

    }
}
