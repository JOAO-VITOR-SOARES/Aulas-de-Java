package dev.joaovitor.app.Models.machine;
import dev.joaovitor.app.Models.products.Tea;


public class TeaMachine implements HotDrinkMachine{

    @Override
    public Tea makeDrink() {
        return new Tea();
    }
}


