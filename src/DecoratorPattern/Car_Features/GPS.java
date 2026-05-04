package DecoratorPattern.Car_Features;

class GPS extends CarDecorator {
    public GPS(Car car) {
        super(car);
    }

    public String features() {
        return car.features() + " + GPS";
    }
}
