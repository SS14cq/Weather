/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import observer.CurrentConditionsDisplay;
import observer.ForecastDisplay;
import observer.HeatIndexDisplay;
import observer.StaticsDisplay;
import subject.WeatherData;

/**
 *
 * @author sarit
 */
public class Main {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(26.5f, 65, 1013);
        System.out.println();
        weatherData.setMeasurements(27.2f, 70, 1010);
        System.out.println();
        weatherData.setMeasurements(25.8f, 90, 1008);
    }
}
