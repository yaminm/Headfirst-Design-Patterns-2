package main.java.duck;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Rocket!");
    }
}
