package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class TestRun {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,3,5,9);
        System.out.println("Before:" + movablePoint);
        movablePoint.Move();
        System.out.println("Latter:" + movablePoint);
    }
}
