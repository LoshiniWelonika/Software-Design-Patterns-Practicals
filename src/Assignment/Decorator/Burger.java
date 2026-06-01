package Assignment.Decorator;

public class Burger implements Food {

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getCost() {
        return 500;
    }
}
