package org.example.bVazifaUchun;

public class CelsiusToKelvin  implements BaseConverte{
    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
   }
}
