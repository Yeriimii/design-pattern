package headfirst.chapter06.receiver;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("거실 오디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println("거실 오디오가 꺼졌습니다.");
    }

    public void setCD() {
        System.out.println("거실 오디오에서 CD가 재상됩니다.");
    }

    public void setVolume(int value) {
        System.out.println("거실 오디오의 볼륨이 " + value + "로 설정되었습니다.");
    }
}
