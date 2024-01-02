package headfirst.chapter10.state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진 되었습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환할 수 없습니다. 동전을 넣지 않았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되어 할 수 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}
