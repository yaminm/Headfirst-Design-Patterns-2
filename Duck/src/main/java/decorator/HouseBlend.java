package main.java.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.desc = "HouseBlend";
    }

    @Override
    public double price() {
        return .98;
    }

}
