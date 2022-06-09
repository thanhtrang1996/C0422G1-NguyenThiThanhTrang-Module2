package ss3_array.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class FindMaxInArray2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lenght array2d :");
       int lenght1 = input.nextInt() ;
        System.out.println("Enter a lenght array :");
        int lenght2 = input.nextInt() ;
       float[][] array2d = new float[lenght1][lenght2];
        System.out.println("Enter a element :" );
        for (int i = 0; i <lenght1 ; i++) {
            for (int j = 0; j < lenght2; j++) {
                array2d[i][j] = input.nextInt();
            }
        }
        for(float[] a : array2d){
            System.out.println(Arrays.toString(a));
        }
        float max = array2d[0][0];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < lenght2; j++) {
                if (array2d[i][j] > max) {
                    max = array2d[i][j];
                }
            }
        }System.out.println("Max in array2d is :" + max);
    }
}
