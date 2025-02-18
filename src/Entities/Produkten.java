package Entities;

public class Produkten {
    private String name;
    private double price;
    private String herkunftregion;

    public Produkten(String name, double price, String herkunftregion) {
        this.name = name;
        this.price = price;
        this.herkunftregion = herkunftregion;
    }

    public Produkten() {
    }

    @Override
    public String toString() {
        return "Produkten{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", herkunftregion='" + herkunftregion + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHerkunftregion() {
        return herkunftregion;
    }

    public void setHerkunftregion(String herkunftregion) {
        this.herkunftregion = herkunftregion;
    }
}
