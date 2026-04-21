package FactoryPattern.TransportBookingSystem;

class BikeFactory extends TransportFactory {
    Transport createTransport() {
        return new Bike();
    } 
}
