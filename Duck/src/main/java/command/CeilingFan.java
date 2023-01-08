package main.java.command;

public class CeilingFan {
    private FAN speed;

    public CeilingFan() {
        speed = FAN.OFF;
    }

    public void high() {
        speed = FAN.HIGH;
    }

    public void medium() {
        speed = FAN.MEDIUM;
    }

    public void low() {
        speed = FAN.LOW;
    }

    public void off() {
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
