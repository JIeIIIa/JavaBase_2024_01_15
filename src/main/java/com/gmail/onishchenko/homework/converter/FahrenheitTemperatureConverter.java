package com.gmail.onishchenko.homework.converter;

public class FahrenheitTemperatureConverter extends TemperatureConverter {
    private static final double MULTIPLIER = 1.8;
    private static final double OFFSET = 32;

    public FahrenheitTemperatureConverter() {
        super("℉");
    }

    @Override
    public double toCelsius(double temperature) {
        return (temperature - OFFSET) / MULTIPLIER;
    }

    @Override
    public double fromCelsius(double temperature) {
        return MULTIPLIER * temperature + OFFSET;
    }
}
