package main.java.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.desc = "Espresso";
    }

    @Override
    public double price() {
        return 1.99;
    }
}
