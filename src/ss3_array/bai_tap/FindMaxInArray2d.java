package ss3_array.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class FindMaxInArray2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length array2d :");
       int length1 = input.nextInt() ;
        System.out.println("Enter a length array :");
        int length2 = input.nextInt() ;
       float[][] array2d = new float[length1][length2];
        System.out.println("Enter a element :" );
        for (int i = 0; i <length1 ; i++) {
            for (int j = 0; j < length2; j++) {
                array2d[i][j] = input.nextInt();
            }
        }
        for (float[] a : array2d) {
            System.out.println(Arrays.toString(a));
        }
        float max = array2d[0][0];
        for (int i = array2d.length - 1; i >= 0; i--)
            for (int j = 0; j < length2; j++) {
                if (array2d[i][j] > max) {
                    max = array2d[i][j];
                }
            }
        System.out.println("Max in array2d is :" + max);
    }
}
