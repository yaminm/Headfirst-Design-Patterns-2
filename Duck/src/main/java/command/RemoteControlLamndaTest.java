package main.java.command;

public class RemoteControlLamndaTest {
    //with lambda
    public static void main(String[] args) {

        RemoteControl rck = new RemoteControl();
        Light light = new Light();
        Command lc = new LightOnCommand(light);
        Command cmd = () -> light.on();
        rck.setCommand(0, cmd);
    }
}
