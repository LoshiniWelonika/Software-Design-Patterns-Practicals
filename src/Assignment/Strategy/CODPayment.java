package Assignment.Strategy;

public class CODPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Cash On Delivery: $" + amount);
    }
}