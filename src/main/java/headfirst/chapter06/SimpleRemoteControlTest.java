package headfirst.chapter06;

import headfirst.chapter06.command.garage.GarageDoorUpCommand;
import headfirst.chapter06.command.light.LightOnCommand;
import headfirst.chapter06.invoker.SimpleRemoteControl;
import headfirst.chapter06.receiver.GarageDoor;
import headfirst.chapter06.receiver.Light;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // 인보커(필요한 작업을 요청할 때 사용할 커맨드 객체를 전달받음)
        Light light = new Light(""); // 리시버
        GarageDoor garageDoor = new GarageDoor(""); // 리시버
        LightOnCommand lightOn = new LightOnCommand(light); // 커맨드 객체 생성(리시버를 전달)
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor); // 커맨드 객체 생성(리시버를 전달)

        remote.setCommand(lightOn); // 커맨드 객체를 인보커에게 전달
        remote.buttonWasPressed(); // 버튼 누름
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
