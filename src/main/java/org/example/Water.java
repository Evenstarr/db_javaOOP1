package org.example;

public class Water extends Product{
    public Water(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                '}';
    }
}
