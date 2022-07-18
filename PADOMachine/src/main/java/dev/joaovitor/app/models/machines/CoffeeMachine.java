package dev.joaovitor.app.models.machines;

import dev.joaovitor.app.models.products.Coffee;
import dev.joaovitor.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
