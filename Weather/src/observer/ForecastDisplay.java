package observer;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import subject.Subject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float lastPressure;
    private float currentPressure = 29.92f;  
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.print("Pronóstico: ");
        if (currentPressure > lastPressure) {
            System.out.println("El clima está mejorando.");
        } else if (currentPressure < lastPressure) {
            System.out.println("Va a lluvia.");
        } else {
            System.setProperty("file.encoding", "UTF-8");
            System.out.println("Más de lo mismo.");
        }
    }
}
