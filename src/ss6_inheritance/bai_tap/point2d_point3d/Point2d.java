package ss6_inheritance.bai_tap.point2d_point3d;
import java.util.Scanner;
public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d() {
    }

    public Point2d(float x, float y) {
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
    public void setXY( float x,float y){
    this.x =  x;
    this.y = y;
    }
    public float[] getXY(){
        float []arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2d(" +
                 x +
                ", " + y +
                ')';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2d point2d = new Point2d(2,3);
        System.out.println(point2d);
    }
}
