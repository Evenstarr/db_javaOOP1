package lesson3;

public class HotWater extends Product implements Comparable<HotWater> {
    int temperature;
    public HotWater(String name, Long price, int temperature) {
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

    @Override
    public int compareTo(HotWater o) {
        return Long.compare(this.price, o.price);
    }
}
