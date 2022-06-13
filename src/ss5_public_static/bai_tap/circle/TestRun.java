package ss5_public_static.bai_tap.circle;

public class TestRun {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }
}
