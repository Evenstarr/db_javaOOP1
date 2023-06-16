package lesson3;

import java.util.LinkedList;

public interface VendingMachine {
    void putProduct(LinkedList<Product> item);

    Product getProduct();

    Product getProduct(String name, Long price, int temperature);

    void sort();
}
