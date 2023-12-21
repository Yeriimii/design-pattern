package headfirst.chapter04.store;

import headfirst.chapter04.pizza.Pizza;

/**
 * 생산자(Creator) 클래스
 * 구체적인 구현은 서브 클래스에서 책임지게 한다.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;

        // 피자 객체 인스턴스를 만드는 일은 PizzaStore의 서브 클래스에 있는 createPizza() 메서드에서 처리한다.
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 팩토리 객체 대신 서브 클래스에서 피자 스타일을 결정하도록 만들기
    // Pizza 인스턴스를 만드는 일은 이제 팩토리 메서드에서 맡아서 처리한다.
    abstract Pizza createPizza(String type);
}
