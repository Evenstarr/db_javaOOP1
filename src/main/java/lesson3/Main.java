package lesson3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();

        Product bonAqua = new Water("bonAqua", 50L);
        Product redKey = new Water("redKey", 60L);
        Product tea = new HotWater("Принцесса Нури", 55L, 99);
        Product latte = new HotWater("Латте", 150L, 80);
        Product espresso = new HotWater("Эспрессо", 100L, 85);
        Product glintwein = new HotWater("Глинтвейн", 60L, 70);
        Product glintwein1 = new HotWater("Глинтвейн1", 80L, 71);

        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        l.add(tea);

        wvm.putProduct(l);

        HotWaterVendingMachine hwvw = new HotWaterVendingMachine();
        LinkedList<Product> lhot = new LinkedList<>();
        lhot.add(latte);
        lhot.add(espresso);
        lhot.add(glintwein);
        lhot.add(glintwein1);
        hwvw.putProduct(lhot);

        System.out.println(hwvw.getProduct("Эспрессо", 100L, 85));

        System.out.println(hwvw.getProduct("Эспрессо", 100L, 105));

        System.out.println(hwvw.getProduct("Горячее пиво", 100L, 105));

        System.out.println("********************");
        System.out.println("Lesson3 Price comparator");
        System.out.println(hwvw);

        hwvw.sort();
        System.out.println(hwvw);
    }
}