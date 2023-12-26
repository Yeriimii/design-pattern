package headfirst.chapter06.command.light;

import headfirst.chapter06.command.Command;
import headfirst.chapter06.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
