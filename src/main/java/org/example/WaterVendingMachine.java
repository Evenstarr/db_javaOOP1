package org.example;

import java.util.LinkedList;

public class WaterVendingMachine implements VendingMachine {
    public LinkedList<Product> waters;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }

    @Override
    public Product getProduct(String name, int price, int temperature) {
        return waters.pollLast();
    }
}
