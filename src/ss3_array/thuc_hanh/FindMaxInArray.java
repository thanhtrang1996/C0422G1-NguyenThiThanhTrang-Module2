package ss3_array.thuc_hanh;

import java.util.Scanner;
import java.util.Arrays;

public class FindMaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }

        }
        System.out.println("The largest property value in the list is :" + max + " Index is : " + index);

    }
}
