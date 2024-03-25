package com.gmail.onishchenko.homework;

import java.util.Arrays;

public class Burgers {
    private String name;
    private String bun;
    private String[] meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.name = "Regular burger";
        this.bun = bun;
        this.meat = new String[]{meat};
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printIngredients();
    }

    public Burgers(String bun, String meat, String cheese, String greens) {
        this.name = "Diet burger";
        this.bun = bun;
        this.meat = new String[]{meat};
        this.cheese = cheese;
        this.greens = greens;
        printIngredients();
    }

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise, String additionalMeat) {
        this.name = "Double burger";
        this.bun = bun;
        this.meat = new String[]{meat, additionalMeat};
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printIngredients();
    }

    private void printIngredients() {
        System.out.println("\t" + name + ":");

        System.out.println("Bun: " + bun);
        System.out.println("Meat(-s): " + Arrays.toString(meat));
        System.out.println("Cheese: " + cheese);
        System.out.println("Greens: " + greens);
        if (mayonnaise != null) {
            System.out.println("Mayonnaise: " + mayonnaise);
        }
    }
}

class BurgerMain {
    public static void main(String[] args) {
        new Burgers("bun", "pork", "cheddar", "greens", "mayonnaise");
        new Burgers("bun", "chicken", "cheese", "greens");
        new Burgers("bun", "beef", "cheddar", "greens", "mayonnaise", "beef");
    }
}