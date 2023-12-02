package headfirst.chapter03.coffee;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
