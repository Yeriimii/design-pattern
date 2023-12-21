package headfirst.chapter04.factory;

import headfirst.chapter04.ingredient.Cheese;
import headfirst.chapter04.ingredient.Clams;
import headfirst.chapter04.ingredient.Dough;
import headfirst.chapter04.ingredient.Pepperoni;
import headfirst.chapter04.ingredient.Sauce;
import headfirst.chapter04.ingredient.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
