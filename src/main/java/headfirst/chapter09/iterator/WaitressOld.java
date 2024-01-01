package headfirst.chapter09.iterator;

import java.util.Iterator;

public class WaitressOld {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public WaitressOld(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("메뉴\n---\n아침 메뉴");
        printMenu(pancakeHouseIterator);
        System.out.println("\n점심 메뉴");
        printMenu(dinerIterator);
        System.out.println("\n저녁 메뉴");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
