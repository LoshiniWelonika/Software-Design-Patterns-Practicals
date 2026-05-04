package DecoratorPattern.Burger_Variations;

public class Main {
    public static void main(String[] args) {

        Burger burger = new BasicBurger();

        burger = new Cheese(burger);
        burger = new Lettuce(burger);
        burger = new Sauce(burger);

        System.out.println("Order: " + burger.getDescription());
        System.out.println("Total Cost: " + burger.cost());
    }
}
