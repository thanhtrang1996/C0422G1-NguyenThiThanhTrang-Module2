package ss4_class_object.bai_tap;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a");
        float a = Float.parseFloat(input.nextLine());
        System.out.println("Enter the b");
        float b = Float.parseFloat(input.nextLine());
        System.out.println("Enter the c");
        float c = Float.parseFloat(input.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("x1 =" + quadraticEquation.getRoot1());
            System.out.println("x2 =" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x1 = x2 =" + quadraticEquation.getRoot1());
        } else {
            System.out.println("No experience");
        }
    }
}

