package builders;

import interfaces.IBuilder;
import products.Manual;

public class ManualBuilder implements IBuilder {
    private Manual carManual;

    public ManualBuilder() {
        reset();
    }

    @Override
    public void reset() {
        carManual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        carManual.addContent("Seats: " + seats);
    }

    @Override
    public void setDoors(int doors) {
        carManual.addContent("Doors: " + doors);
    }

    @Override
    public void setColor(String color) {
        carManual.addContent("Color: " + color);
    }

    @Override
    public void setCompany(String company) {
        carManual.addContent("Company: " + company);
    }

    @Override
    public void setEngine(String engine) {
        carManual.addContent("Engine: " + engine);
    }

    public Manual getProduct() {
        Manual product = carManual;
        this.reset();
        return product;
    }

}
