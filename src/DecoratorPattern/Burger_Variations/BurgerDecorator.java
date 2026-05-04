package DecoratorPattern.Burger_Variations;

abstract class BurgerDecorator implements Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
}
