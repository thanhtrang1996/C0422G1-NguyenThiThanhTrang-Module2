package ss13_Sort.thuc_hanh;

public class BubbleSort {
     static int [] list ={2,3,5,-4,6,51,45,41,23,4,34};
     public static void bubbleSort(int[] list){
         boolean needNextPass = true;
         for (int i = 1; i <list.length&&needNextPass ; i++) {
             needNextPass = false;
             for (int j = 0; j < list.length -i; j++) {
                 if (list[j]>list[j+1]){
                     int temp = list[j];
                     list[j] = list[j+1];
                     list[j+1]= temp;
                     needNextPass = true;
                 }
             }
         }
     }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j] +" ");
        }
    }
    }

