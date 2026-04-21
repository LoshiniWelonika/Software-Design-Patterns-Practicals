package FactoryPattern.TransportBookingSystem;

public class CarFactory extends TransportFactory{
    Transport createTransport(){
        return new Car();
    }
}
