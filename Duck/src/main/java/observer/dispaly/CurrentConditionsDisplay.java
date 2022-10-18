package main.java.observer.dispaly;

import main.java.observer.DisplayElement;
import main.java.observer.Observer;
import main.java.observer.WeatherData;

public class CurrentConditionsDisplay extends Display implements Observer, DisplayElement {

    public CurrentConditionsDisplay(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("display!");
    }
}
