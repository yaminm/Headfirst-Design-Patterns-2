package main.java.observer.dispaly;

import main.java.observer.Observer;
import main.java.observer.WeatherData;

public abstract class Display implements Observer {

    WeatherData weatherData;

    public Display(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
}
