package ss7_abstraction_interface.bai_tap.Colorable;

public class Square extends Shape implements Colorable {
    private int length1;


    public Square() {
    }
    public Square( int length1 ) {

        this.length1 = length1;

    }
    public  double getArea(){
        return this.length1*this.length1;
    }

    @Override
    public String toString() {
        return "Square{" +
                " length1=" + length1 +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
