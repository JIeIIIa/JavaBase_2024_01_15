package com.gmail.onishchenko.lecture13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest.runAllTests();

    }

    public static void runAllTests() {
        System.out.println("  -= RUN ALL TESTS =-");
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.factorialTest();
        calculatorTest.factorialZeroTest();
    }

    @Test
    public void factorialTest() {
        // given
        Calculator calculator = new Calculator();
        int value = 4;
        int expected = 24;

        // when
        long factorial = calculator.factorial(value);

        // then
        System.out.println("Actual value: " + value + "! == " + factorial);
        System.out.println("Expected value: 4! == 24");
        Assertions.assertEquals(expected, factorial);
    }

    @Test
    public void factorialZeroTest() {
        Calculator calculator = new Calculator();
        int value = 0;
        int expected = 1;

        long factorial = calculator.factorial(value);

        System.out.println("Actual value: " + value + "! == " + factorial);
        System.out.println("Expected value: 0! == 1");
        Assertions.assertEquals(expected, factorial);
    }
}
