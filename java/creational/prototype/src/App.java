import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Shape> shapes = new ArrayList<Shape>();
        Circle circle = new Circle(10, "red");
        shapes.add(circle);

        Circle anothCircle = circle.clone();
        shapes.add(anothCircle);

        Rectangle rectangle = new Rectangle(10, 20, "blue");
        shapes.add(rectangle);

    }
}