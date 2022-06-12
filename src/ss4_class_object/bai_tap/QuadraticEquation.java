package ss4_class_object.bai_tap;
import java.util.Scanner;

public class QuadraticEquation {
   private float a;
   private float b;
   private float c;
   private float delta;
   private double x1;;
   private double x2;
    public QuadraticEquation (float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
        public float getA() {
            return a;
        }

        public void setA(float a) {
            this.a = a;
        }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public float getDiscriminant(){
       delta  = this.b*this.b - 4*this.a*this.c;
       return delta;
    }
    public double getRoot1(){
        x1 = (-this.b + Math.sqrt(delta))/(2*this.a);
        return x1;
    }
    public double getRoot2(){
        x2 = (-this.b + Math.sqrt(delta))/(2*this.a);
        return x2;
    }
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
