package ss7_abstraction_interface.bai_tap.Colorable;

public class Rectangle extends Shape {
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

    public int getArea() {
        return this.length*this.wirth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wirth=" + wirth +
                '}';
    }


}
