package dev.joaovitor.app.Models.machine;
import dev.joaovitor.app.Models.products.Tea;
import dev.joaovitor.app.Models.products.coffee;
public  class CoffeMachine implements HotDrinkMachine {

   public coffee makeDrink() {
      return new coffee();
   }
}
