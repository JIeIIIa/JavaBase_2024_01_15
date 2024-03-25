package com.gmail.onishchenko.homework.converter;

public abstract class TemperatureConverter {
    private static final String CELSIUS_SIGN = "°C";
    private final String temperatureSign;

    public TemperatureConverter(String temperatureSign) {
        this.temperatureSign = temperatureSign;
    }

    public final String celsiusSign() {
        return CELSIUS_SIGN;
    }

    public final String temperatureSign() {
        return temperatureSign;
    }

    public abstract double fromCelsius(double temperature);

    public abstract double toCelsius(double temperature);
}
