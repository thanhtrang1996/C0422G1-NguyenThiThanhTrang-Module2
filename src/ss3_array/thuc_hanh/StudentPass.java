package ss3_array.thuc_hanh;
import java.util.Scanner;
public class StudentPass {
    public static void main(String[] args) {
      int size;
      Scanner scanner = new Scanner(System.in);
      do{
          System.out.println("Enter a size :");
          size = Integer.parseInt(scanner.nextLine());
          if (size > 30){
              System.out.println("Size should not exceed 30");
          }
      }while (size > 30);
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("Enter element " +(i +1) +":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int count = 0;
        for (int j : array)
            if (j > 5 && j <= 10) {
                count++;
            }
        System.out.println("Number of student who pass the exam :" + count);

    }
}
