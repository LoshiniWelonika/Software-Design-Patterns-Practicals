package StrategyPattern.DeliveryService;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setDeliveryStrategy(new ExpressDelivery());
        order.processOrder();
    }
}
