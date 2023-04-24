public abstract class Shape {
    public int x;
    public int y;
    public String color;

    // regular constructor
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    };

    // prototype constructor
    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    };

    public abstract Shape clone();

}
