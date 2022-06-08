package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class DoiTien {
    public static void main(String[] args) {
        double rate = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" USD:");
        usd = scanner.nextInt();
        double vnd =  usd * rate;
        System.out.println("Money is :" + vnd);
    }
}
