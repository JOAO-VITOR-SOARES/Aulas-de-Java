package dev.joaovitor.app.models.machines;

import dev.joaovitor.app.models.products.HotDrink;
import dev.joaovitor.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
