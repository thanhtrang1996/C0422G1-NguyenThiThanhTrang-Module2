package ss7_abstraction_interface.bai_tap.Colorable;

public class TestRun {
    public static void main(String[] args) {
        Shape []shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(6,9);
        shapes[2] = new Square(8);
        for (Shape shape:shapes) {
            System.out.println( shape);
        }
        for (Shape shape:shapes) {
            if(shape instanceof Circle){
                System.out.println("Area of circle :" +((Circle) shape).getArea());
            }
            if(shape instanceof Rectangle){
                System.out.println("Area of rectangle :" + (((Rectangle) shape).getArea()));
            }
            if(shape instanceof Square){
                ((Square)shape).howToColor() ;
                System.out.println("Area of square :" + ((Square)shape).getArea() );
            }

        }

    }
}
