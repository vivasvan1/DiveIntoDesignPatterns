public class Circle  extends Dot{
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
        this.draw();
    }

    public void draw() {
        System.out.println("Drawing a circle at " + x + ", " + y + " with radius " + radius);
    }
}
