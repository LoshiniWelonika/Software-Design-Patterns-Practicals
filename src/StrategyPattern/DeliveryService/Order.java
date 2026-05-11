package StrategyPattern.DeliveryService;

class Order {
    private DeliveryStrategy strategy;

    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder() {
        strategy.deliver();
    }
}
