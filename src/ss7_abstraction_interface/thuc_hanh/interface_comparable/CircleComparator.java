package ss7_abstraction_interface.thuc_hanh.interface_comparable;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public CircleComparator() {
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.getRadius() - o2.getRadius());
    }
}
