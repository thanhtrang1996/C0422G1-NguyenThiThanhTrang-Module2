package ss7_abstraction_interface.bai_tap.resizeable;

public class Rectangle extends Shape implements Resizeable{
    private int length;
    private int wirth;

    public Rectangle() {
    }

    public Rectangle(int length, int wirth) {
        this.length = length;
        this.wirth = wirth;
    }

    public Rectangle(String color, boolean filled, int length, int wirth) {
        super(color, filled);
        this.length = length;
        this.wirth = wirth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wirth=" + wirth +
                '}';
    }

    @Override
    public void resize(double percent) {
        length += length*percent/100;
        wirth += wirth*percent/100;
    }
}
