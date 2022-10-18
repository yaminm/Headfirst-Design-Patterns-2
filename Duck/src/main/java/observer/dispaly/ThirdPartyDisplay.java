package main.java.observer.dispaly;

import main.java.observer.DisplayElement;
import main.java.observer.Observer;
import main.java.observer.WeatherData;

public class ThirdPartyDisplay extends Display implements Observer, DisplayElement {


    public ThirdPartyDisplay(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("display!");
    }
}
