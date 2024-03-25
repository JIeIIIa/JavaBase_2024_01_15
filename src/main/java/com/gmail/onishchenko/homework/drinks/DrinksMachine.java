package com.gmail.onishchenko.homework.drinks;

public class DrinksMachine {
    private static int totalCost;
    private int orderCost;
    private int count;

    private void makeCoffee() {
        System.out.println("Making coffee...");
        System.out.println("Adding milk...");
        System.out.println("Adding sugar...");
        System.out.println("Done");
        count++;
        orderCost += Drinks.COFFEE.getPrice();
        totalCost += Drinks.COFFEE.getPrice();
    }

    private void makeTea() {
        System.out.println("Making tea...");
        System.out.println("Adding sugar...");
        System.out.println("Done");
        count++;
        orderCost += Drinks.TEA.getPrice();
        totalCost += Drinks.TEA.getPrice();
    }

    private void makeLemonade() {
        System.out.println("Pouring lemonade...");
        System.out.println("Done");
        count++;
        orderCost += Drinks.LEMONADE.getPrice();
        totalCost += Drinks.LEMONADE.getPrice();
    }

    private void makeMojito() {
        System.out.println("Making mojito...");
        System.out.println("Pouring soda...");
        System.out.println("Adding ice...");
        System.out.println("Adding mint...");
        System.out.println("Adding lemon...");
        System.out.println("Done");
        count++;
        orderCost += Drinks.MOJITO.getPrice();
        totalCost += Drinks.MOJITO.getPrice();
    }

    private void makeMineralWater() {
        System.out.println("Pouring mineral water...");
        System.out.println("Done");
        count++;
        orderCost += Drinks.MINERAL_WATER.getPrice();
        totalCost += Drinks.MINERAL_WATER.getPrice();
    }

    private void makeCocaCola() {
        System.out.println("Pouring Coca-Cola...");
        System.out.println("Done");
        count++;
        orderCost += Drinks.COCA_COLA.getPrice();
        totalCost += Drinks.COCA_COLA.getPrice();
    }

    public void menu() {
        System.out.println("Available drinks:");
        for (Drinks drink : Drinks.values()) {
            System.out.println("\t" + drink);
        }
    }

    public void makeDrink(Drinks drink) {
        switch (drink) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case MINERAL_WATER:
                makeMineralWater();
                break;
            case COCA_COLA:
                makeCocaCola();
                break;
            default:
                System.out.println("Can't make a " + drink);
        }
    }

    public String orderInfo() {
        return String.format("You ordered %d drink(-s). Order cost is %d", count, orderCost);
    }

    public static String totalOrderCost() {
        return String.format("Total cost is %d for all time", totalCost);
    }
}
