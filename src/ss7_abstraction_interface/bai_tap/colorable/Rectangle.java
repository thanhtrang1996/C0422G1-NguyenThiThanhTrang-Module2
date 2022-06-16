package ss7_abstraction_interface.bai_tap.colorable;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int height, int wirth) {
        this.height = height;
        this.width = wirth;
    }


    public int getArea() {
        return this.height *this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height =" + height +
                ", width =" + width +
                '}';
    }


}
