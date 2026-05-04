package DecoratorPattern.Burger_Variations;

class Lettuce extends BurgerDecorator {

    public Lettuce(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + " + Lettuce";
    }

    public double cost() {
        return burger.cost() + 30;
    }
}