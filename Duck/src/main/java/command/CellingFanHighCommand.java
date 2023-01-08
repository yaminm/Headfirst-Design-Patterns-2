package main.java.command;

public class CellingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    CeilingFan.FAN prevSpeed;

    public CellingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }

    @Override
    public void execute() {
        ceilingFan.high();
        prevSpeed = ceilingFan.getSpeed();
    }

    @Override
    public void undo() {
        ceilingFan.setFan(prevSpeed);
    }
}
