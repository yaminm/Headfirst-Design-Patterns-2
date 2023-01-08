package main.java.decorator;

public abstract class Beverage {
    String desc = "Unknown beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double price();
}
