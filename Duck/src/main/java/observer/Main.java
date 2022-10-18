package main.java.observer;

import main.java.observer.dispaly.CurrentConditionsDisplay;
import main.java.observer.dispaly.StatisticDisplay;
import main.java.observer.dispaly.ThirdPartyDisplay;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        StatisticDisplay statisticDisplay = new StatisticDisplay(wd);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(wd);

        wd.setMeasurements(1, 3, 4);

    }
}
