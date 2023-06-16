package lesson3;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.price, o2.price);
    }
}
