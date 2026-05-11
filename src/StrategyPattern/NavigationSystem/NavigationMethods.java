package StrategyPattern.NavigationSystem;

class CarRoute implements RouteStrategy {
    public void buildRoute() {
        System.out.println("Calculating Car Route");
    }
}

class WalkingRoute implements RouteStrategy {
    public void buildRoute() {
        System.out.println("Calculating Walking Route");
    }
}

class BikeRoute implements RouteStrategy {
    public void buildRoute() {
        System.out.println("Calculating Bike Route");
    }
}
