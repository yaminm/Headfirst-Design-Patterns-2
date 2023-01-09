package main.java.command;

import java.util.ArrayList;

public class RemoteControllMacroTest {
    public static void main(String[] args) {

        SimpleRemoteControl rc = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CeilingFan ceilingFan = new CeilingFan();
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(ceilingFan);

        Command cmd = new MacroCommand(new Command[]{lightOnCommand, cellingFanHighCommand});
        rc.setSlot(cmd);

        rc.pushButton();
    }
}
