package main.java.command;

public class RemoteControl {
    Command[] commands;

    RemoteControl() {
        commands = new Command[9];
    }

    public void setCommand(int number, Command cmd) {
        commands[number] = cmd;
    }

    public void pushButton(int number) {
        commands[number].execute();
    }
}
