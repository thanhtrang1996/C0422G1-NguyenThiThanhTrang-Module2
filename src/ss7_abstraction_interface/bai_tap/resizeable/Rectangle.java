package ss7_abstraction_interface.bai_tap.resizeable;

public class Rectangle extends Shape implements Resizeable{
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.height = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, int height, int width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height =" + height +
                ", width =" + width +
                '}';
    }

    @Override
    public void resize(double percent) {
        height += height *percent/100;
        width += width *percent/100;
    }
}
