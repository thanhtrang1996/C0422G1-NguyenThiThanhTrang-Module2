package ss11_map.bai_tap.util;

import ss11_map.bai_tap.models.Product;

import java.util.Comparator;

public class Descending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o2.getPrice() > o1.getPrice()) {
            return 1;
        } else if (o2.getPrice() < o1.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

}
