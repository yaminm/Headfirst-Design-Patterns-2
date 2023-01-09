package main.java.command;

public class CeilingFan {
    private FAN speed;

    public CeilingFan() {
        speed = FAN.OFF;
    }

    public void high() {
        System.out.println("High");
        speed = FAN.HIGH;
    }

    public void medium() {
        System.out.println("Medium");
        speed = FAN.MEDIUM;
    }

    public void low() {
        System.out.println("low");
        speed = FAN.LOW;
    }

    public void off() {
        System.out.println("off");
        speed = FAN.OFF;
    }

    public FAN getSpeed() {
        return speed;
    }

    public void setFan(FAN prevSpreed) {
        speed = prevSpreed;
    }

    public enum FAN {
        HIGH,
        MEDIUM,
        LOW,
        OFF
    }
}
