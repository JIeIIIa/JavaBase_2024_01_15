package com.gmail.onishchenko.lecture13;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("From before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After before all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each test");
        this.calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Before each test");
        Assertions.assertNotNull(calculator);
    }

    @Test
    public void factorialTest() {
        // given
        System.out.println("factorialTest");
        int value = 4;
        int expected = 24;

        // when
        long factorial = calculator.factorial(value);

        // then
        Assertions.assertEquals(expected, factorial);
    }

    @Test
//    @Disabled
//    @DisplayName(value = "customTestName")
    public void factorialZeroTest() {
        System.out.println("factorialZeroTest");
        int value = 0;
        int expected = 1;

        long factorial = calculator.factorial(value);

        Assertions.assertEquals(expected, factorial);
    }

    @Test
    public void factorialNegativeTest() {
        System.out.println("factorialNegativeTest");
        int value = -10;
        int expected = -1;

        long factorial = calculator.factorial(value);

        Assertions.assertEquals(expected, factorial);
    }
}
