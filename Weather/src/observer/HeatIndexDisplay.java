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
public class HeatIndexDisplay implements DisplayElement,Observer{

    private float heatIndex = 0.0f;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }

    private float computeHeatIndex(float T, float R) {
        // Coeficientes de la ecuación del índice de calor
        double c1 = -8.78469475556;
        double c2 = 1.61139411;
        double c3 = 2.33854883889;
        double c4 = 0.14611605;
        double c5 = -0.012308094;
        double c6 = -0.0164248277778;
        double c7 = 0.002211732;
        double c8 = 7.2546e-4;
        double c9 = -3.582e-6;

        return (float)(c1 + c2 * T + c3 * R + c4 * T * R + c5 * T * T + c6 * R * R + c7 * T * T * R + c8 * T * R * R + c9 * T * T * R * R);
    }

    @Override
    public void display() {
         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.printf("Índice de calor: %.2f°C\n", heatIndex);
    }
    
}
