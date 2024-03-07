package com.gmail.onishchenko.lecture10;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.money = 10000000;
        int money = bankAccount.withdraw(1000050);
        System.out.println("I'm got " + money);
    }
}
