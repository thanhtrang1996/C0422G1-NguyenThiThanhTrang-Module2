package ss6_inheritance.bai_tap.circle;
import java.util.Scanner;
public class TestRun {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height : ");
        cylinder.setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter radius : ");
        cylinder.setRadius( Double.parseDouble(scanner.nextLine())) ;
        System.out.print("Enter color :");
        cylinder.setColor(scanner.nextLine());

        System.out.println(cylinder.toString() + "Volume of cylinder :" + cylinder.getVolume());
    }
}
