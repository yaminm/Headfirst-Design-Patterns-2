package main.java.command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void pushButton() {
        slot.execute();
    }
}
