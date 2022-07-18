package dev.joaovitor.app.models.machines;

import dev.joaovitor.app.models.products.Chocolate;
import dev.joaovitor.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
