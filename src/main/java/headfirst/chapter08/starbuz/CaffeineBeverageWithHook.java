package headfirst.chapter08.starbuz;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    /**
     * 서브클래스에서 필요할 때 오버라이드할 수 있는 메서드이므로 후크
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
