package main.java.command;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command LightCommand = new LightOnCommand(light);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setSlot(LightCommand);
        control.pushButton();
    }
}
