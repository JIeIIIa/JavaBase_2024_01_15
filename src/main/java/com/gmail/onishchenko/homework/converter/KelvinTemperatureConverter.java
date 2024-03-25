package com.gmail.onishchenko.homework.converter;

public class KelvinTemperatureConverter extends TemperatureConverter {
    private static final double ZERO_CELSIUS_IN_KELVIN = 273.15;

    public KelvinTemperatureConverter() {
        super("K");
    }

    @Override
    public double toCelsius(double temperature) {
        return temperature - ZERO_CELSIUS_IN_KELVIN;
    }

    @Override
    public double fromCelsius(double temperature) {
        return temperature + ZERO_CELSIUS_IN_KELVIN;
    }
}
