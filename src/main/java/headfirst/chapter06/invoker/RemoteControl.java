package headfirst.chapter06.invoker;

import headfirst.chapter06.command.Command;
import headfirst.chapter06.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        }
        undoCommand = offCommands[slot];
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append(
                    "[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n"
            );
        }
        return stringBuff.toString();
    }
}
