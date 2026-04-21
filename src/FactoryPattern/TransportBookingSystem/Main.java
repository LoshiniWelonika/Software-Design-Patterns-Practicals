package FactoryPattern.TransportBookingSystem;

public class Main{
    public static void main(String[] args) {
        TransportFactory factory = new CarFactory();
        Transport t = factory.createTransport();
        t.deliver();
    } 
}
