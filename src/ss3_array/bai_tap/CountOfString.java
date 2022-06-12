package ss3_array.bai_tap;
import java.util.Scanner;
public class CountOfString {
    public static void main(String[] args) {
        String string ;
        int count = 0;
        char str1 = 'e';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your a string :");
         string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
           if (string.charAt(i) == str1){
               count++;
           }

        }
        System.out.println("Tong so lan ky tu xuat hien trong chuoi la :" + count);

}}
