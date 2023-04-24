import interfaces.IBuilder;

// This is the Director class which is optional as the client can directly call the builder methods.
public class Director {
    public IBuilder builder;

    public void setBuilder(IBuilder builder) {
        this.builder = builder;
        builder.reset();
    }

    public void constructSportsCar() {
        builder.reset();
        builder.setSeats(2);
        builder.setDoors(2);
        builder.setEngine("V8");
        builder.setColor("Red");
        builder.setCompany("Ferrari");
    }

    public void constructSUVCar() {
        builder.reset();
        builder.setSeats(5);
        builder.setDoors(5);
        builder.setEngine("V6");
        builder.setColor("Black");
        builder.setCompany("Toyota");
    }

    public void constructSedanCar() {
        builder.reset();
        builder.setSeats(4);
        builder.setDoors(4);
        builder.setEngine("V6");
        builder.setColor("Red");
        builder.setCompany("Honda");
    }
}
