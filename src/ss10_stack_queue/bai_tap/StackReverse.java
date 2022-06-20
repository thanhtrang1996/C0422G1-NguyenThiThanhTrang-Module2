package ss10_stack_queue.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length :");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = Integer.parseInt(input.nextLine());
        }
        Stack<Integer> reverseArray = new Stack<>();
        for (int element:array) {
          reverseArray.push(element);
        } System.out.println( "Before :"+ reverseArray);
        for (int i = 0; i < array.length ; i++) {
            array[i] = reverseArray.pop();
        }
        System.out.println("After :"+Arrays.toString(array));
        System.out.println("Enter string :");
        String str = input.nextLine();
        String []str1 = str.split(" ") ;
        Stack<String> reverseString = new Stack<>();
        for (String str2:str1) {
           reverseString.push(str2) ;
        }
        for (int i = 0; i < str1.length ; i++) {
            str1[i] = reverseString.pop();
        }
        str = "";
        for (int i = 0; i <str1.length ; i++) {
         str += str1[i] + " ";
        }
        System.out.println(str);
    }
}
