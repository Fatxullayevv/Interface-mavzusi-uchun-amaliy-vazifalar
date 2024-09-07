package org.example.bVazifaUchun;


import org.example.bVazifaUchun.BaseConverte;
import org.example.bVazifaUchun.CelsiusToFahrenheit;
import org.example.bVazifaUchun.CelsiusToKelvin;


public class Main {
    public static void main(String[] args) {
               double tempInCelsius = 25.0;

        BaseConverte kelvinConverter = new CelsiusToKelvin();
        double kelvinTemp = kelvinConverter.convert(tempInCelsius);


        BaseConverte fahrenheitConverter = new CelsiusToFahrenheit();
        double fahrenheitTemp = fahrenheitConverter.convert(tempInCelsius);

        System.out.println(tempInCelsius + "C = " + kelvinTemp + " K");
        System.out.println(tempInCelsius + "C = " + fahrenheitTemp + " F");

    }
}