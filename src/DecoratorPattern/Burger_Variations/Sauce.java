package DecoratorPattern.Burger_Variations;

class Sauce extends BurgerDecorator {

    public Sauce(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + " + Sauce";
    }

    public double cost() {
        return burger.cost() + 20;
    }
}