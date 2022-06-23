package ss13_Sort.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
   public static void insertionSort (int[] array){
       int pos;
       int x;
       System.out.println( "Before :"+Arrays.toString(array));
       for (int i = 1; i <array.length ; i++) {
          x = array[i];
          pos = i;
          while (pos >0 && x < array[pos - 1]){
              array[pos] = array[pos -1];
              pos--;

          }

           System.out.println("Enter index" + i);
           System.out.println(Arrays.toString(array));
          array[pos] =x;
           System.out.println(Arrays.toString(array));
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size :");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        insertionSort(array);
        for (int i = 0; i <array.length ; i++) {

        } System.out.println( "Before :"+Arrays.toString(array));


    }
}
