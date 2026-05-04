package DecoratorPattern.Car_Features;

class Stereo extends CarDecorator {
    public Stereo(Car car) {
        super(car);
    }

    public String features() {
        return car.features() + " + Stereo";
    }
}