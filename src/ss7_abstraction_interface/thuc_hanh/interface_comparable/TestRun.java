package ss7_abstraction_interface.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle("red", true, 2);
        circle[1] = new Circle("yellow", false, 3);
        circle[2] = new Circle("yellow", false, 1);

        System.out.println(circle.toString());
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        System.out.println("Sort ");
        comparableCircles[0] = new ComparableCircle("red", true, 2);
        comparableCircles[1] = new ComparableCircle("yellow", true, 3);
        comparableCircles[2] = new ComparableCircle("yellow", true, 1);
        Arrays.sort(comparableCircles);
        for (ComparableCircle c : comparableCircles) {
            System.out.println(c);
        }
        System.out.println("c2");
        CircleComparator circleComparator = new CircleComparator();

        Arrays.sort(circle, circleComparator);
        for (Circle c: circle
             ) {
            System.out.println(c);

        }
    }
}

