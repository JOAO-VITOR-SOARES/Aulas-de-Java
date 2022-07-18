package dev.joaovitor.app.models.products;

public abstract class HotDrink {

     int quantity;
     int temperature;
     int sugar;

    private HotDrink(){}

    public HotDrink(HotDrink.DefaultDrink defaultDrink) {
        this.quantity = defaultDrink.getQuantity();
        this.temperature = defaultDrink.getTemperature();
        this.sugar = defaultDrink.getSugar();
    }

    public static class DefaultDrink extends HotDrink
    {
        public DefaultDrink(int quantity, int temperature, int sugar) {
            setQuantity(quantity);
            setTemperature(temperature);
            setSugar(sugar);
        }

        private void setSugar(int sugar) {
            this.sugar = sugar;
        }

        private void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        private void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
    protected int getQuantity() {
        return quantity;
    }
    protected int getTemperature() {
        return temperature;
    }

    protected int getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return "{" +
                "\"quantity\":" + this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                "}";
    }
}
