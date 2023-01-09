package main.java.command;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command cmd : commands)
            cmd.execute();
    }

    @Override
    public void undo() {
        for (Command cmd : commands)
            cmd.undo();
    }
}
