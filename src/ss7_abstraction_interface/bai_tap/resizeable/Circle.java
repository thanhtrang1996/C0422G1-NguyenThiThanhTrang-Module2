package ss7_abstraction_interface.bai_tap.resizeable;

public class Circle extends  Shape implements Resizeable {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double percent) {
        radius += radius *percent/100;
    }
}
