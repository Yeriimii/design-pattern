package headfirst.chapter06;

import headfirst.chapter06.command.Command;
import headfirst.chapter06.command.MacroCommand;
import headfirst.chapter06.command.light.LightOffCommand;
import headfirst.chapter06.command.light.LightOnCommand;
import headfirst.chapter06.command.stereo.StereoOffWithCDCommand;
import headfirst.chapter06.command.stereo.StereoOnWithCDCommand;
import headfirst.chapter06.invoker.RemoteControlWithUndo;
import headfirst.chapter06.receiver.Light;
import headfirst.chapter06.receiver.Stereo;

public class RemoteLoaderWithMacro {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        Command[] partyOn = {lightOn, stereoOn};
        Command[] partyOff = {lightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- 매크로 ON ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- 매크로 OFF ---");
        remoteControl.offButtonWasPushed(0);
    }
}
