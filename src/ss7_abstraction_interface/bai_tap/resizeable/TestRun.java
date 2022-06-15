package ss7_abstraction_interface.bai_tap.resizeable;

import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
       shapes [0] = new Circle(2);
       shapes[1] = new Rectangle(4,3);
       shapes[2] = new Square(6);
        for (Shape s:shapes) {
            System.out.println("Before :" + s);

        }
        for (Shape s:shapes) {
            if(s instanceof Circle){
                ((Circle) s).resize(100);
                System.out.println( "After :" +s);
            }
            if(s instanceof Rectangle){
                ((Rectangle)s) .resize(50);
                System.out.println( "After:" +s);

            }
            if(s instanceof Square){
                ((Square)s) .resize(100);
                System.out.println("After :"+s);

            }

        }
    }
}
