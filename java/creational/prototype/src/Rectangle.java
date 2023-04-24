public class Rectangle extends Shape {
    public int width, height;

    public Rectangle(int x, int y, String color) {
        super(x, y, color);
        this.width = x;
        this.height = y;
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
