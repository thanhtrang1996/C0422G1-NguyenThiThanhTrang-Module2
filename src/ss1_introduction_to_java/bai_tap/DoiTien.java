package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class DoiTien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien USD:");
        usd = scanner.nextInt();
        double thanhTien =  usd * vnd;
        System.out.println("So tien ban duoc la :" + thanhTien);
    }
}
