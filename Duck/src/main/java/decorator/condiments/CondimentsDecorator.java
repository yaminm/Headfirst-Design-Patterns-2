package main.java.decorator.condiments;

import main.java.decorator.Beverage;

/**
 * will be used as a additions to base Beverage
 */
public abstract class CondimentsDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDesc();

}
