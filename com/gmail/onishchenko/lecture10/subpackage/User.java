package com.gmail.onishchenko.lecture10.subpackage;

import com.gmail.onishchenko.lecture10.BankAccount;

public class User {
    BankAccount account = new BankAccount(1000);

    public int withdraw(int amount) {
//        account.money = 1_000_000;
        return account.withdraw(amount);
    }
}
