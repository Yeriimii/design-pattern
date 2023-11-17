package headfirst.chapter01.model;

import headfirst.chapter01.behavior.fly.FlyWithWings;
import headfirst.chapter01.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // 상속받는 인스턴스 변수
        quackBehavior = new Quack(); //performQuack 이 호출되면 요구되는 행동을 다시 Quack 객체에게 위임
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
