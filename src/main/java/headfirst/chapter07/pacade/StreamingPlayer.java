package headfirst.chapter07.pacade;

public class StreamingPlayer {
    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    public void play(String movie) {
        System.out.println("스트리밍 플레이어에서 \"" + movie + "\"를 재상합니다.");
    }

    public void stop() {
        System.out.println("스트리밍 플레이어에서 재상을 종료합니다.");
    }

    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }
}
