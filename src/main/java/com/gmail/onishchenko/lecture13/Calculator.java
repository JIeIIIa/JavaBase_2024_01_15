package com.gmail.onishchenko.lecture13;

public class Calculator {
    private long result;

    public long getResult() {
        return result;
    }

    // n! = 1 * 2 * 3 * 4 * ... * (n-1) * n =  (n-1)! * n
    // (n-1)!  = 1 * 2 * 3 * 4 * ... * (n-1)
    public long factorial(int value) {
        if (value == 1) {
            System.out.println("1! == 1");
            return 1;
        }

        System.out.println("value is " + value);
        return factorial(value - 1) * value;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        long result = calculator.factorial(3);

        System.out.println(result);
    }
}