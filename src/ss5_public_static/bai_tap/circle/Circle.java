package ss5_public_static.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }
    double getArea(){
        return 2 * this.radius * 3.14;
    }
}
