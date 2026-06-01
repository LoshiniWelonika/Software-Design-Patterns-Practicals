package Assignment.Strategy;

public class VisaPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Visa Card");
    }
}
