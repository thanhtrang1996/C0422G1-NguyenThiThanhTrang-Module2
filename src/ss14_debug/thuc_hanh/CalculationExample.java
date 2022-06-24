package ss14_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x,int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng của x và y là:" + a);
            System.out.println("Hiệu của x và y là :" +b);
            System.out.println("Tích của x và y là :" + c);
            System.out.println("Thương của x và y là:" + d);
        }
        catch (Exception e){
            System.out.println("Xãy ra lỗi" + e.getMessage());
        }
    }
    public static void main(String[] args) {
       try{
           Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập x :");
        int x = scanner.nextInt();
        System.out.print("Hãy nhập y :");
        int y = scanner.nextInt();
       CalculationExample calculationExample = new CalculationExample();
       calculationExample.calculate(x,y); }
       catch (Exception e){
           System.out.println("Bạn nhập sai ");
       }
    }
}
