package ss6_inheritance.bai_tap.point2d_point3d;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        this.setX(x);
        this.setY(y);
    }

    public float[] getXYZ() {
        float[] arr1 = {getX(), getY(), z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3d(" +
               ","+ getX() +
                "," +getY() +","+
                z +
                ')';
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d(4, 5, 2);
        System.out.println(point3d);
    }
}
