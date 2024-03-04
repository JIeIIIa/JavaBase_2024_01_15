package com.gmail.onishchenko.lecture13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void factorialTest() {
        // given
        Calculator calculator = new Calculator();
        int value = 4;
        int expected = 24;

        // when
        long factorial = calculator.factorial(value);

        // then
        Assertions.assertEquals(expected, factorial);
    }

    @Test
    public void factorialZeroTest() {
        Calculator calculator = new Calculator();
        int value = 0;
        int expected = 1;

        long factorial = calculator.factorial(value);

        Assertions.assertEquals(expected, factorial);
    }

    @Test
    public void factorialNegativeTest() {
        Calculator calculator = new Calculator();
        int value = -10;
        int expected = -1;

        long factorial = calculator.factorial(value);

        Assertions.assertEquals(expected, factorial);
    }
}
