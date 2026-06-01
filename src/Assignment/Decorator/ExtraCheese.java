package Assignment.Decorator;

public class ExtraCheese extends FoodDecorator {

    public ExtraCheese(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return food.getCost() + 150;
    }
}
