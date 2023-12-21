package headfirst.chapter04;

import headfirst.chapter04.pizza.Pizza;
import headfirst.chapter04.store.ChicagoPizzaStore;
import headfirst.chapter04.store.NYPizzaStore;
import headfirst.chapter04.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza1.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza2.getName() + "\n");
    }
}
