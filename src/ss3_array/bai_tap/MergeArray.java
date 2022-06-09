package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element  " + (i + 1) + ": array1");
            array1[i] = input.nextInt();
        }
        System.out.println("Array 1" + Arrays.toString(array1));
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": array2");
            array2[i] = input.nextInt();
        }
        System.out.println("Array 2" + Arrays.toString(array2));
        int[] array3 = new int[10];
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];

            }

            for (int i = 0; i <array2.length;i++) {
                array3[array1.length + i] = array2[i];
            }

        System.out.println( " Arayy 3 :" + Arrays.toString(array3));


    }
}
