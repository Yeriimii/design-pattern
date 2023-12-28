package headfirst.chapter07.pacade;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        StreamingPlayer player = new StreamingPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player, projector, lights, screen, popper);

        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}
