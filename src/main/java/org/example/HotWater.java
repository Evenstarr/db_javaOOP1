package org.example;

public class HotWater extends Product{
    int temperature;
    public HotWater(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {return temperature;}

    @Override
    public String toString() {
        return "HotWater{" +
                "temperature=" + temperature +
                ", name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                '}';
    }
}
