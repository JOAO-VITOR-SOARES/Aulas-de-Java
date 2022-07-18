package dev.joaovitor.app.Models.products;

public class coffee extends Tea {

    private int quantity = 3;
    private int temperature = 3;
    private int sugar = 3;

    public coffee(){};

    @Override
    public String toString() {
        return "coffee{" +
                "\"quantity\":" + quantity +
                ", \"temperature\":" + temperature +
                ", \"sugar\":" + sugar +
                '}';
    }
}
