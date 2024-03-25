package com.gmail.onishchenko.homework.drinks;

public enum Drinks {
    COFFEE(35),
    TEA(10),
    LEMONADE(25),
    MOJITO(100),
    MINERAL_WATER(15),
    COCA_COLA(30);

    private final int price;

    Drinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
