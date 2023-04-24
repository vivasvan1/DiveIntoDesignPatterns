public class Dot implements Graphic {
    int x, y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        System.out.println("Drawing a dot at " + x + ", " + y);
    }
}
