package ss7_abstraction_interface.thuc_hanh.interface_comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int)(o.getRadius()-this.getRadius());
    }
}
