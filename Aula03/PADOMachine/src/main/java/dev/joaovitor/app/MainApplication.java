package dev.joaovitor.app;


import dev.joaovitor.app.Models.machine.CoffeMachine;
import dev.joaovitor.app.Models.machine.DrinkMachine;
import dev.joaovitor.app.Models.machine.TeaMachine;
import dev.joaovitor.app.Models.products.Tea;
import dev.joaovitor.app.Models.products.coffee;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication {

    public static void main(String[] args) throws IOException {

        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepare();


//
//        if (valor == 0){
//            CoffeMachine  coffeeMachine = new CoffeMachine();
//            coffee coffe = coffeeMachine.makeCoffee();
//            System.out.println("");
//            System.out.println(coffe);
//            System.out.println("");
//        }
//
//
//        if (valor == 1){
//            TeaMachine teaMachine = new TeaMachine();
//            Tea tea = teaMachine.makeCoffee();
//            System.out.println("");
//            System.out.println(tea);
//            System.out.println("");
//        }
    }
}

