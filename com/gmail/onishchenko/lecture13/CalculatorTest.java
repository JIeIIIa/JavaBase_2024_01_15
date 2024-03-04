package com.gmail.onishchenko.lecture13;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest.runAllTests();

    }

    public static void runAllTests() {
        System.out.println("  -= RUN ALL TESTS =-");
        factorialTest();
        factorialZeroTest();
    }

    public static void factorialTest() {
        Calculator calculator = new Calculator();
        int value = 4;
        long factorial = calculator.factorial(value);

        System.out.println("Actual value: " + value + "! == " + factorial);
        System.out.println("Expected value: 4! == 24");
    }

    public static void factorialZeroTest() {
        Calculator calculator = new Calculator();
        int value = 0;
        long factorial = calculator.factorial(value);

        System.out.println("Actual value: " + value + "! == " + factorial);
        System.out.println("Expected value: 0! == 1");
    }
}
