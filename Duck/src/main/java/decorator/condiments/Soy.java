package main.java.decorator.condiments;

import main.java.decorator.Beverage;

public class Soy extends CondimentsDecorator {

    public Soy(Beverage b) {
        this.beverage = b;
    }

    @Override
    public double price() {
        return beverage.price() + .5;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }

}
