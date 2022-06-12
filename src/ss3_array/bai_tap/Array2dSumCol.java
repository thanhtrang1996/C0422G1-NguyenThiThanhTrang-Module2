package ss3_array.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class Array2dSumCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length2d :");
      int length1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter a length1 :");
        int length2 = Integer.parseInt(input.nextLine());
        float[][] array2d = new float[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j <length2 ; j++) {
                System.out.println("Enter element " + (i + 1) +":");
                array2d[i][j] = input.nextInt();
            }
        }
        for (float[] a : array2d) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Enter column :");
        int column = input.nextInt();
        float sum = 0;
            for (int j = 0; j <length2 ; j++) {
                sum += array2d[column][j];
        }
        System.out.println("Sum of column :" + sum);

    }
}
