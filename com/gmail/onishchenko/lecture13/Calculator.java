package com.gmail.onishchenko.lecture13;

public class Calculator {
    private long result;

    public long getResult() {
        return result;
    }

    public long factorial(int value) {
        int result = 1;
        if (value < 0) {
            return -1;
        }
        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        this.result = result;
        return this.result;
    }
}