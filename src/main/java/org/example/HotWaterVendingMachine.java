package org.example;

import java.util.LinkedList;
import java.util.Objects;

public class HotWaterVendingMachine implements VendingMachine{
    public LinkedList<Product> hotwaters;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotwaters = item;
    }

    @Override
    public Product getProduct() {
        return hotwaters.pollLast();
    }

    @Override
    public Product getProduct(String name, int price, int temperature) {
        Product res = null;
        for (Product tmp: hotwaters) {
            if(tmp instanceof HotWater tmp1) {
                if (Objects.equals(tmp1.getName(), name) && tmp1.getPrice() == price && tmp1.getTemperature() == temperature) {
                    res = tmp1;
                    break;
                }
            }
        }
        return res;
    }
}
