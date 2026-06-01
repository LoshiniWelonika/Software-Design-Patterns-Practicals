package Assignment.Decorator;

public abstract class FoodDecorator implements Food {

    protected Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }
}
