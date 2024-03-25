package com.gmail.onishchenko.lecture13;

public class Calculator {
    private long result;

    public long getResult() {
        return result;
    }

    // n! = 1 * 2 * 3 * 4 * ... * (n-1) * n =  (n-1)! * n
    // (n-1)!  = 1 * 2 * 3 * 4 * ... * (n-1)
    public long factorial(int value) {
        if (value == 1 || value == 0) {
            System.out.println(value + "! == 1");
            return 1;
        } else if (value < 0) {
            return -1;
        }

        System.out.println("value is " + value);
        return factorial(value - 1) * value;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        long result = calculator.factorial(1_000_000);

        System.out.println(result);
    }
}