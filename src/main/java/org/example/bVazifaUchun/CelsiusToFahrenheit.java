package org.example.bVazifaUchun;

public class CelsiusToFahrenheit implements BaseConverte {
    @Override
    public double convert(double temperatureInCelsius) {
        return (temperatureInCelsius * 9 / 5) + 32;
    }
}
