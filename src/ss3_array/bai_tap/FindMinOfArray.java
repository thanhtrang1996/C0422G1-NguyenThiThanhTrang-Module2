package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(input.nextLine());

        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }

        }
        System.out.println("Min of array is : " + min);
    }
}
