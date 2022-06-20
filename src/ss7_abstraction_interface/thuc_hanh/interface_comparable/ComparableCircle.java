package ss7_abstraction_interface.thuc_hanh.interface_comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (o.getRadius()> this.getRadius() ){
            return 1;
        }else if
        ( o.getRadius()< this.getRadius() )
        {return -1;
        }else
        return 0;
    }
}
