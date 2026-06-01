package Assignment.Composite;

public class FoodItem extends MenuComponent {

    private String name;

    public FoodItem(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("   Food Item: " + name);
    }
}
