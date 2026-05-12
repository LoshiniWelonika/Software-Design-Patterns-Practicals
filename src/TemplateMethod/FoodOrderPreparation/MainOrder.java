package TemplateMethod.FoodOrderPreparation;

public class MainOrder {
    public static void main(String[] args) {

        FoodOrder burger = new BurgerOrder();
        burger.processOrder();

        System.out.println();

        FoodOrder pizza = new PizzaOrder();
        pizza.processOrder();
    }
}
