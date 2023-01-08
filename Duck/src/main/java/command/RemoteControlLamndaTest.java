package main.java.command;

public class RemoteControlLamndaTest {
    public static void main(String[] args) {

        RemoteControl rck = new RemoteControl();
        Light light = new Light();
        Command lc = new LightOnCommand(light);
        rck.setCommand(0, lc);
    }
}
