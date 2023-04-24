package products;

public class Car {
    public int seats = 4;
    public int doors = 4;
    public String color = "red";
    public String company = "Ford";
    public String engine = "V8";

    @Override
    public String toString() {
        return "Car [color=" + color + ", company=" + company + ", doors=" + doors + ", engine=" + engine + ", seats="
                + seats + "]";
    }
}   
