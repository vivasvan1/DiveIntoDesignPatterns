public class Circle extends Shape {
    public int radius;
    public String color;

    public Circle(int radius, String color) {
        super(radius, radius, color);
        this.radius = radius;
        this.color = color;
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
        this.color = source.color;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

}
