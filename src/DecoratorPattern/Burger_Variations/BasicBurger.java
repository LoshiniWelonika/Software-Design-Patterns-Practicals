package DecoratorPattern.Burger_Variations;

class BasicBurger implements Burger {
    public String getDescription() {
        return "Basic Burger";
    }

    public double cost() {
        return 200;
    }
}
