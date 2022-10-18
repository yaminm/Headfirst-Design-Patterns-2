package main.java;

import main.java.duck.Duck;
import main.java.duck.FlyRocketPowered;
import main.java.duck.MallardDuck;
import main.java.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
