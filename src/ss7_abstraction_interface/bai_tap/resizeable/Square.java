package ss7_abstraction_interface.bai_tap.resizeable;

public class Square  extends Shape implements Resizeable{
    private int length1;


    public Square() {
    }
    public Square( int length1 ) {

        this.length1 = length1;

    }

    @Override
    public String toString() {
        return "Square{" +
                " length1=" + length1 +
                '}';
    }

    @Override
    public void resize(double percent) {
        length1 += length1*percent/100;

    }
}
