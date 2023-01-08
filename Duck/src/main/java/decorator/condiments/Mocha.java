package main.java.decorator.condiments;

import main.java.decorator.Beverage;

public class Mocha extends CondimentsDecorator {

    public Mocha(Beverage b) {
        this.beverage = b;
    }

    @Override
    public double price() {
        return beverage.price() + 0.5;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

}
