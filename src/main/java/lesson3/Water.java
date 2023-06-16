package lesson3;

public class Water extends Product {
    public Water(String name, Long price) {
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
