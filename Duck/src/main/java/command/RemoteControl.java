package main.java.command;

public class RemoteControl {
    Command[] commands;
    Command undo;

    RemoteControl() {
        commands = new Command[9];
        undo = new NullCommand();
    }

    public void setCommand(int number, Command cmd) {
        commands[number] = cmd;
    }

    public void pushButton(int number) {
        commands[number].execute();
        undo = commands[number];
    }

    public void undoButtonPush() {
        undo.undo();
    }
}
