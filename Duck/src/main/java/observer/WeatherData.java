package main.java.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    public ArrayList<Observer> observerList;
    private int temperature, humidity, pressure;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(s -> s.update(getTemperature(), getHumidity(), getPressure()));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
