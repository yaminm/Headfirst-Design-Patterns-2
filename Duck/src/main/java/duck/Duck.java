package main.java;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }


    public void display(){
        System.out.println("display");
    }
    public void swim(){
        System.out.println("swim");
    }

    public void performFly(){
        flyBehavior.fly();//Duck obj delegates behavior to the object referenced by the interface behavior(flyBehavior)
    }
    public void performQuack(){
        quackBehavior.makeSound();
    }
}
