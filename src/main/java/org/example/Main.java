package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();

        Product bonAqua = new Water("bonAqua", 50);
        Product redKey = new Water("redKey", 60);
        Product tea = new HotWater("Принцесса Нури", 50, 99);
        Product latte = new HotWater("Латте", 150, 80);
        Product espresso = new HotWater("Эспрессо", 100, 85);

        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        l.add(tea);

        wvm.putProduct(l);

        HotWaterVendingMachine hwvw = new HotWaterVendingMachine();
        LinkedList<Product> lhot = new LinkedList<>();
        lhot.add(latte);
        lhot.add(espresso);
        hwvw.putProduct(lhot);

        System.out.println(hwvw.getProduct("Эспрессо", 100, 85));

        System.out.println(hwvw.getProduct("Эспрессо", 100, 105));

        System.out.println(hwvw.getProduct("Горячее пиво", 100, 105));

        System.out.println("********************");

        System.out.println(hwvw.getProduct());
        System.out.println(hwvw.getProduct());

        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
    }
}