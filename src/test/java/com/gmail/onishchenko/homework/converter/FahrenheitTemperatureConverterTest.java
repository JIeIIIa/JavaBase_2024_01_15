package com.gmail.onishchenko.homework.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitTemperatureConverterTest {
    private static final double PRECISION = 0.00001;

    private FahrenheitTemperatureConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new FahrenheitTemperatureConverter();
    }

    @Test
    void toCelsius() {
        // given
        double fahrenheit = 451;
        double expected = 232.77777;

        // when
        double result = converter.toCelsius(fahrenheit);

        // then
        Assertions.assertEquals(expected, result, PRECISION);
    }

    @Test
    void toFahrenheit() {
        // given
        double celsius = 42;
        double expected = 107.6;

        // when
        double result = converter.fromCelsius(celsius);

        // then
        Assertions.assertEquals(expected, result, PRECISION);
    }

    @Test
    void temperatureSign() {
        // when
        String result = converter.temperatureSign();

        // then
        Assertions.assertEquals("℉", result);
    }
}