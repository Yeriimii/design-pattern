package headfirst.chapter06.command.ceilingfan;

import headfirst.chapter06.command.Command;
import headfirst.chapter06.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
