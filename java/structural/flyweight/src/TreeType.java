// The flyweight class contains a portion of the state of a
// tree. These fields store values that are unique for each
// particular tree. For instance, you won't find here the tree
// coordinates. But the texture and colors shared between many
// trees are here. Since this data is usually BIG, you'd waste a
// lot of memory by keeping it in each tree object. Instead, we
// can extract texture, color and other repeating data into a
// separate TreeType which lots of individual tree objects can
// need only reference to.

public class TreeType {
    public String name;
    public String color;
    public String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        // This is a large object, so we'll
        // set it once and reuse it.
        this.texture = texture;
    }

    public void draw(boolean[][] canvas, int x, int y) {
        System.out.println("Drawing a tree with " + color + " " + name + " with " + texture + " texture.");
    }
}
