/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class WeatherData implements Subject{
    
    double Temperature;
    double Humidity;
    double Preassure;

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public void setHumidity(double Humidity) {
        this.Humidity = Humidity;
    }

    public void setPreassure(double Preassure) {
        this.Preassure = Preassure;
    }

    @Override
    public void regiterObserver() {
    }

    @Override
    public void removeObserver() {
    }

    @Override
    public void NotifyObservers() {
    }
    
    
}
