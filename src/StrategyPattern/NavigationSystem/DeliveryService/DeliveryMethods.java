package StrategyPattern.NavigationSystem.DeliveryService;

class StandardDelivery implements DeliveryStrategy {
    public void deliver() {
        System.out.println("Standard Delivery Selected");
    }
}

class ExpressDelivery implements DeliveryStrategy {
    public void deliver() {
        System.out.println("Express Delivery Selected");
    }
}

class OvernightDelivery implements DeliveryStrategy {
    public void deliver() {
        System.out.println("Overnight Delivery Selected");
    }
}
