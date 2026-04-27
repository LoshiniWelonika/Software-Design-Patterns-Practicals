package AdapterPattern.PaymentGateway;

class PayPal {
    public void sendPayment(double amount){
        System.out.println("Paid using Paypal: " + amount);
    }
}
