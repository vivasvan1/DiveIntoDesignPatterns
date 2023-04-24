import java.util.ArrayList;

public class ImageEditor {
    private static ArrayList<Graphic> all;

    public static void load() {
        all = new ArrayList<Graphic>();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        CompoundGraphic cg = new CompoundGraphic();
        cg.add(new Dot(10, 20));
        cg.add(new Circle(5, 3, 10));
        all.add(cg);
    }

    public static void groupSelected(ArrayList<Graphic> selected) {
        CompoundGraphic cg = new CompoundGraphic();
        for (Graphic g : selected) {
            cg.add(g);
            all.remove(g);
        }
        all.add(cg);
    }
}
