package Assignment.Decorator;

public class ExtraSauce extends FoodDecorator {

    public ExtraSauce(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Extra Sauce";
    }

    @Override
    public double getCost() {
        return food.getCost() + 100;
    }
}
