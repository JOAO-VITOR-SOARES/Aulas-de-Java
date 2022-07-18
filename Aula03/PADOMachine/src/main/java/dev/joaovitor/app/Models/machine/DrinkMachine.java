package dev.joaovitor.app.Models.machine;
import dev.joaovitor.app.Models.products.HotDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DrinkMachine {

    private List<HotDrinkMachine> machines = new ArrayList<>();

        public DrinkMachine() throws IOException {

            CoffeMachine coffeMachine = new CoffeMachine();
            TeaMachine teaMachine = new TeaMachine();
            machines.add(coffeMachine);
            machines.add(teaMachine);

        }

        public void prepare() throws IOException {
            System.out.println("1.Tea");
            System.out.println("Escolha sua Bebida!");
            System.out.println("0.Coffe");

            for (int i = 0; i < machines.size(); i++) {
                System.out.println(machines.get(i).getClass().getSimpleName());
            }

            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int valor = Integer.parseInt(reader.readLine());
                System.out.println("Valor informado pelo usuário" + valor);

                if (valor <= machines.size() && valor >= 0) {

                }
            }
        }
}
