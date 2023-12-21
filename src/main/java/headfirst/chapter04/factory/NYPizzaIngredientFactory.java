package headfirst.chapter04.factory;

import headfirst.chapter04.ingredient.Cheese;
import headfirst.chapter04.ingredient.Clams;
import headfirst.chapter04.ingredient.Dough;
import headfirst.chapter04.ingredient.FreshClams;
import headfirst.chapter04.ingredient.Garlic;
import headfirst.chapter04.ingredient.MarinaraSauce;
import headfirst.chapter04.ingredient.Mushroom;
import headfirst.chapter04.ingredient.Onion;
import headfirst.chapter04.ingredient.Pepperoni;
import headfirst.chapter04.ingredient.RedPepper;
import headfirst.chapter04.ingredient.ReggianoCheese;
import headfirst.chapter04.ingredient.Sauce;
import headfirst.chapter04.ingredient.SlicedPepperoni;
import headfirst.chapter04.ingredient.ThinCrustDough;
import headfirst.chapter04.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
