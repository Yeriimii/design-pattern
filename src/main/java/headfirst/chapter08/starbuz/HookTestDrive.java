package headfirst.chapter08.starbuz;

public class HookTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n 커피 준비 중 ...");
        coffeeHook.prepareRecipe();
    }
}
