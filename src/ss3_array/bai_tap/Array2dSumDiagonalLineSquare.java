package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2dSumDiagonalLineSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length1 :");
        int length1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter length2 :");
        int length2 = length1;
        float[][] array2d = new float[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                System.out.println("Enter element" + (i + 1) + ":");
                array2d[i][j] = Float.parseFloat(input.nextLine());
            }
        }
        for (int i = 0; i < length1; i++) {
            float[] a = array2d[i];
            System.out.println(Arrays.toString(a));
        }
        float sum = 0;
        float sum1 = 0;
        float sum2 = 0;

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (i == j)//đường chéo chính
                    sum1 += array2d[i][j];
               if (i + j == length1 - 1)//đường chéo phụ
                   sum2 += array2d[i][j];
            }
        }

        sum = sum1 + sum2;

        System.out.println("sum" + sum);
    }
}

