package ss6_inheritance.bai_tap.circle;

public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
    }
    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder { "  +
                "radius  = " +  getRadius() +
                ", color = '" + getColor() + '\'' +
                " height = " + height +
                '}';
    }

    public double getVolume(){
       return   this.getRadius() *this. getRadius() * this.getHeight() * Math.PI;
    }
}
