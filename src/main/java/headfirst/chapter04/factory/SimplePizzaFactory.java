package headfirst.chapter04.factory;

import headfirst.chapter04.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("greek")) {
//            pizza = new GreekPizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }

        return pizza;
    }
}