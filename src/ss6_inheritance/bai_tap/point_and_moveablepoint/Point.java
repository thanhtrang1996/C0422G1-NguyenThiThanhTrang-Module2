package ss6_inheritance.bai_tap.point_and_moveablepoint;

import java.util.Scanner;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point(" +
                x +
                ", " + y +
                ')';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Point point = new Point(2,4);
        System.out.println(point);

    }
}
