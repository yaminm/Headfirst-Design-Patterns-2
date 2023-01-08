package main.java.decorator.condiments;

import main.java.decorator.Beverage;

public class Whip extends CondimentsDecorator {

    public Whip(Beverage b) {
        this.beverage = b;
    }

    @Override
    public double price() {
        return beverage.price() + .4;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }

}
