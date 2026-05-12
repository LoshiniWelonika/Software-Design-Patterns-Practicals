package TemplateMethod.FoodOrderPreparation;

abstract class FoodOrder {

    final void processOrder() {
        takeOrder();
        prepareFood();
        packFood();
        deliverFood();
    }

    void takeOrder() {
        System.out.println("Order Taken");
    }

    abstract void prepareFood();

    void packFood() {
        System.out.println("Food Packed");
    }

    void deliverFood() {
        System.out.println("Food Delivered");
    }
}
