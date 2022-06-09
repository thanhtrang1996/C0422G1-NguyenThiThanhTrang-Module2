package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length -1; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter a add element to array :");
        int x = input.nextInt();
        int index;
        do {
            System.out.println("Index");
            index = input.nextInt();
            if (index<0|| index> array.length-1){
                System.out.println("Enter index again");
            }
        }while (index<0|| index> array.length-1);

        if (index >= array.length - 1) {
            System.out.println("Not add element to array");
        }
        for (int j = array.length-1; j >= index; j--) {
                array[j] = array[j - 1];
        }
        array[index] = x;

        System.out.println(Arrays.toString(array));
    }
}
