package headfirst.chapter01;

import headfirst.chapter01.behavior.fly.FlyRocketPowered;
import headfirst.chapter01.model.Duck;
import headfirst.chapter01.model.MallardDuck;
import headfirst.chapter01.model.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // MallardDuck에서 상속받은 performQuack 메서드가 호출(객체의 QuackBehavior에게 할 일을 위임한다.)
        mallard.performQuack();
        mallard.performFly();

        // 동적으로 행동 지정하기
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
