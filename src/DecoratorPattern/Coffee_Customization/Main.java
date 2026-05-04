package DecoratorPattern.Coffee_Customization;

// Main.java
public class Main {
    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();

        coffee = new Milk(coffee);   // add milk
        coffee = new Sugar(coffee);  // add sugar

        System.out.println("Total Cost: " + coffee.cost());
    }
}
