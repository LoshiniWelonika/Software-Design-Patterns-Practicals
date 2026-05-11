package StrategyPattern.NavigationSystem;

public class Main {
    public static void main(String[] args) {
        Navigator nav = new Navigator();

        nav.setStrategy(new CarRoute());
        nav.navigate();

        nav.setStrategy(new WalkingRoute());
        nav.navigate();
    }
}
