import java.util.ArrayList;
import java.util.List;

public class App {

    List<Tree> trees = new ArrayList<Tree>();
    static boolean[][] canvas;

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw(boolean[][] canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }

    public static void main(String[] args) throws Exception {
        canvas = new boolean[100][100];
        

    }
}
