package builders;

import interfaces.IBuilder;
import products.Car;

public class CarBuilder implements IBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
        this.reset();
    }

    @Override
    public void reset() {
        car.color = "";
        car.company = "";
        car.doors = 0;
        car.engine = "";
        car.seats = 0;
    }

    @Override
    public void setSeats(int seats) {
        car.seats = seats;
    }

    @Override
    public void setDoors(int doors) {
        car.doors = doors;
    }

    @Override
    public void setColor(String color) {
        car.color = color;
    }

    @Override
    public void setCompany(String company) {
        car.company = company;
    }

    @Override
    public void setEngine(String engine) {
        car.engine = engine;
    }

    public Car getProduct() {
        return car;
    }

}
