package AbstractFactory.VehicleManufacturing;

public class ElectricVehicleFactory implements VehicleFactory{

    @Override
    public Bike createBike() {
        return new ElectricBike(); 
    }

    @Override
    public Car createCar() {
        return new ElectricCar();
    }
    
}
