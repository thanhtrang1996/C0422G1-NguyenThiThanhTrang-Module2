package ss7_abstraction_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable {
    private int side;


    public Square() {
    }
    public Square( int side ) {

        this.side = side;

    }
    public  double getArea(){
        return this.side *this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side =" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
