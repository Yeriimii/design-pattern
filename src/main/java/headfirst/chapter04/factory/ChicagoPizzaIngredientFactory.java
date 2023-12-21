package headfirst.chapter04.factory;

import headfirst.chapter04.ingredient.Cheese;
import headfirst.chapter04.ingredient.Clams;
import headfirst.chapter04.ingredient.Dough;
import headfirst.chapter04.ingredient.Pepperoni;
import headfirst.chapter04.ingredient.Sauce;
import headfirst.chapter04.ingredient.SlicedPepperoni;
import headfirst.chapter04.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
