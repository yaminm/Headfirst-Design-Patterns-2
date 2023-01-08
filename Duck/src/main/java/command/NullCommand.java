package main.java.command;

public class NullCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Null Command");
    }

    @Override
    public void undo() {
        System.out.println("Null Command");

    }
}
