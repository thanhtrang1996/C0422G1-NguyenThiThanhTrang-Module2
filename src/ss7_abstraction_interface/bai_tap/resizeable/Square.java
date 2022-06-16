package ss7_abstraction_interface.bai_tap.resizeable;

public class Square  extends Shape implements Resizeable{
    private int side;


    public Square() {
    }
    public Square( int side ) {

        this.side = side;

    }

    @Override
    public String toString() {
        return "Square{" +
                " side =" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        side += side *percent/100;

    }
}
