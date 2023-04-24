import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<Graphic>();

    public void add(Graphic g) {
        children.add(g);
    }

    public void remove(Graphic g) {
        children.remove(g);
    }

    public void move(double x, double y) {
        for(Graphic g : children) {
            g.move(x, y);
        }
    }

    public void draw() {
        for (Graphic g : children) {
            g.draw();
        }
    }
}
