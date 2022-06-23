package ss13_Sort.thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {

   public static void bubbleSortByStep(int[] list){
       boolean check = true;
       for (int i = 1; i < list.length && check; i++) {
           check = false;
           System.out.print(list[i]);
           for (int j = 0; j <list.length -i ; j++) {
               if (list[j]>list[j+1]){
                   int temd = list[j];
                   list[j] = list[j+1];
                   list[j +1] = temd;
                   check = true;
               }
           }
       }
   }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length :");
        int size = Integer.parseInt(scanner.nextLine());
        int [] list = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter element " + (i+1) + ":");
             list[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <size ; i++) {
            System.out.println( "Before" + list[i]);
        }
bubbleSortByStep(list);
        for (int i = 0; i <size ; i++) {
            System.out.println( "After" +list[i]);
        }

    }
}
