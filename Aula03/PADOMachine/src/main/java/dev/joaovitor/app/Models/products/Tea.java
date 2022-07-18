package dev.joaovitor.app.Models.products;

public class Tea {
    private int quantity = 7;
    private int temperature = 5;
    private int sugar = 4;

    public Tea(){};

    @Override
    public String toString() {
        return "TEA{" +
                "\"quantity\":" + quantity +
                ", \"temperature\":" + temperature +
                ", \"sugar\":" + sugar +
                '}';
    }
}
