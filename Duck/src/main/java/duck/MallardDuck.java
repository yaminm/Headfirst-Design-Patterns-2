package main.java;

public class MallardDuck extends Duck{
    public MallardDuck() {
        //todo: concrete implementation -change!
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck pic");
    }

    @Override
    public void swim() {

    }
}
