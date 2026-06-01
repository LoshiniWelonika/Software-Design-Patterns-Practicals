package Assignment;

import Assignment.Singleton.*;
import Assignment.Strategy.*;
import Assignment.Observer.*;
import Assignment.Decorator.*;
import Assignment.Composite.*;

public class Main {

    public static void main(String[] args) {

        // Singleton
        DeliveryManager manager = DeliveryManager.getInstance();
        manager.assignDriver("John");
        manager.trackDelivery("ORD1001");
        manager.updateStatus("On The Way");

        // Strategy
        PaymentContext payment = new PaymentContext();
        payment.setPaymentStrategy(new VisaPayment());
        payment.processPayment(2500);

        // Observer
        Order order = new Order();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Preparing");
        order.setStatus("Out For Delivery");

        // Decorator
        Food burger = new Burger();
        burger = new ExtraCheese(burger);
        burger = new ExtraSauce(burger);

        System.out.println(burger.getDescription());
        System.out.println("Price: Rs." + burger.getCost());

        // Composite
        Menu burgers = new Menu("Burgers");
        burgers.add(new FoodItem("Chicken Burger"));
        burgers.add(new FoodItem("Beef Burger"));

        Menu pizzas = new Menu("Pizzas");
        pizzas.add(new FoodItem("Cheese Pizza"));
        pizzas.add(new FoodItem("Veg Pizza"));

        Menu restaurantMenu = new Menu("Restaurant Menu");
        restaurantMenu.add(burgers);
        restaurantMenu.add(pizzas);

        restaurantMenu.display();
    }
}