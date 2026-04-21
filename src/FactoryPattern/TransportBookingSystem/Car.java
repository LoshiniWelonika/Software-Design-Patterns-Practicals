package FactoryPattern.TransportBookingSystem;

class Car implements Transport {
    public void deliver() {
        System.out.println("Traveling by car");
    }
}
