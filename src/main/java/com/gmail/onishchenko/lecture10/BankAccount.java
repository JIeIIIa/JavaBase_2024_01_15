package com.gmail.onishchenko.lecture10;

public class BankAccount {
    protected int money;

    private String passPhrase;
    private boolean active;


    public BankAccount(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getPassPhrase() {
        return passPhrase;
    }

    public void setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
    }

    public boolean isActive() {
        return active;
    }

    public int withdraw(int amount) {
        if (amount > money) {
            System.out.println("You don't have " + amount);
            return 0;
        }

        money -= amount;

        return amount;
    }
}
