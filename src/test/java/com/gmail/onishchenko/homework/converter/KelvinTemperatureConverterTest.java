package com.gmail.onishchenko.homework.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinTemperatureConverterTest {
    private static final double PRECISION = 0.00001;

    private KelvinTemperatureConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new KelvinTemperatureConverter();
    }

    @Test
    void toCelsius() {
        // given
        double kelvin = 273;
        double expected = -0.15;

        // when
        double result = converter.toCelsius(kelvin);

        // then
        Assertions.assertEquals(expected, result, PRECISION);
    }

    @Test
    void toKelvin() {
        // given
        double celsius = 12.34;
        double expected = 285.49;

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
        Assertions.assertEquals("K", result);
    }
}