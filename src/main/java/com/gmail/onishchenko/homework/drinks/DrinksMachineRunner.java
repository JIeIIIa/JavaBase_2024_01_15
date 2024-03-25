package com.gmail.onishchenko.homework.drinks;

import java.util.Scanner;

public class DrinksMachineRunner {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String YES = "Y";

    private final DrinksMachine drinksMachine;

    public DrinksMachineRunner(DrinksMachine drinksMachine) {
        this.drinksMachine = drinksMachine;
    }

    public void order() {
        String answer;
        do {
            drinksMachine.menu();
            Drinks drinks = chooseDrink();
            drinksMachine.makeDrink(drinks);

            System.out.print("Make one more drink (y/n)? ");
            answer = SCANNER.nextLine();
        } while (YES.equalsIgnoreCase(answer));
    }

    private Drinks chooseDrink() {
        Drinks drink = null;
        do {
            System.out.print("Choose a drink: ");
            String value = SCANNER.nextLine();
            try {
                drink = Drinks.valueOf(value.toUpperCase());
            } catch (IllegalArgumentException | NullPointerException exception) {
                System.out.println("Unknown drink( Please, try again...");
            }
        } while (drink == null);

        return drink;
    }

    public void printOrderInfo() {
        System.out.println(drinksMachine.orderInfo());
    }
}
