package headfirst.chapter04.pizza;

import headfirst.chapter04.ingredient.Cheese;
import headfirst.chapter04.ingredient.Clams;
import headfirst.chapter04.ingredient.Dough;
import headfirst.chapter04.ingredient.Pepperoni;
import headfirst.chapter04.ingredient.Sauce;
import headfirst.chapter04.ingredient.Veggies;

/**
 * 제품(Product) 클래스
 */
public abstract class Pizza {

    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();
    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    }
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
