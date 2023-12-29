package headfirst.chapter08.starbuz;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * Coffee와 Tea에서 (서브클래스) 처리하도록 추상 메서드로 선언
     */
    abstract void brew();

    /**
     * Coffee와 Tea에서 (서브클래스) 처리하도록 추상 메서드로 선언
     */
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
