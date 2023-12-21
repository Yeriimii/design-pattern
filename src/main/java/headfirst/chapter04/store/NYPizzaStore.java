package headfirst.chapter04.store;

import headfirst.chapter04.pizza.CheesePizza;
import headfirst.chapter04.pizza.ClamPizza;
import headfirst.chapter04.factory.NYPizzaIngredientFactory;
import headfirst.chapter04.pizza.Pizza;
import headfirst.chapter04.factory.PizzaIngredientFactory;

/**
 * 구상 생산자(concrete creator) 클래스
 * 구체적인 구현을 책임진다.
 */
public class NYPizzaStore extends PizzaStore {

    /**
     * 팩토리 메소드
     * 뉴욕 스타일의 피자를 만드는 모든 방법이 캡슐화되어 있다.
     */
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
//        } else if (type.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
//        } else if (type.equals("veggie")) {
//            return new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
