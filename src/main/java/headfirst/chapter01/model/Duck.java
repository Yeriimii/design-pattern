package headfirst.chapter01.model;

import headfirst.chapter01.behavior.fly.FlyBehavior;
import headfirst.chapter01.behavior.quack.QuackBehavior;

public abstract class Duck {

    // 행동 변수는 행동 인터페이스 형식으로 선언
    // 두 인터페이스는 행동을 위임 받는다. *구성(composition)을 이용한다.*
    FlyBehavior flyBehavior; // 실행 시 특정 행동 레퍼런스 저장
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();


    public void performFly() {
        flyBehavior.fly();
    }

    // 모든 Duck에는 QuackBehavior 인퍼테이스를 구현하는 레퍼런스가 있음.
    public void performQuack() {
        quackBehavior.quack();  // 꽥꽥거리는 행동을 직접 처리하지 않고 quackBehavior 로 참조되는 객체에게 행동을 위임
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    public Duck setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this;
    }

    public Duck setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this;
    }
}
