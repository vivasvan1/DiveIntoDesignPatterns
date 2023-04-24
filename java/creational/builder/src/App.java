import builders.CarBuilder;
import builders.ManualBuilder;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to the Builder Pattern");
        System.out.println("====================================");
        Director director = new Director();

        System.out.println("Constructing a sports car");
        CarBuilder carBuilder = new CarBuilder();
        director.setBuilder(carBuilder);
        director.constructSportsCar();
        System.out.println(carBuilder.getProduct().toString());

        System.out.println("====================================");
        System.out.println("Constructing a manual for a sports car");
        ManualBuilder carManualBuilder = new ManualBuilder();
        director.setBuilder(carManualBuilder);
        director.constructSportsCar();
        carManualBuilder.getProduct().createPdf();

        System.out.println("Welcome to the Builder Pattern for the second time");
        System.out.println("====================================");

        System.out.println("Constructing a Sedan car");
        director.setBuilder(carBuilder);
        director.constructSedanCar();
        System.out.println(carBuilder.getProduct().toString());

        System.out.println("====================================");
        System.out.println("Constructing a manual for a sports car");
        director.setBuilder(carManualBuilder);
        director.constructSedanCar();
        carManualBuilder.getProduct().createPdf();
    }
}
