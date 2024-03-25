package com.gmail.onishchenko.homework.drinks;

public class DrinkMachineDemo {

    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            System.out.println("     -=  Start ORDER #" + i + " =-");
            DrinksMachine drinksMachine = new DrinksMachine();
            DrinksMachineRunner runner = new DrinksMachineRunner(drinksMachine);
            runner.order();
            runner.printOrderInfo();
            System.out.println("     -= Finish ORDER #" + i + " =-");
        }

        System.out.println();
        System.out.println(DrinksMachine.totalOrderCost());
        System.out.println("Good bye...");
    }
}
