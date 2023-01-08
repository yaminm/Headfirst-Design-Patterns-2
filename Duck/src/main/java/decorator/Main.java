package main.java.decorator;

import main.java.decorator.condiments.Mocha;
import main.java.decorator.condiments.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        Beverage b2 = new HouseBlend();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println("desc:" + b2.getDesc() + " \nPrice:" + b2.price());
    }
}
