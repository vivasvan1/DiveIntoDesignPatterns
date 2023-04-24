public class TreeFactory {
    static TreeType[] treeTypes = new TreeType[100];

    static int treeTypeCount = 0;

    static TreeType getTreeType(String name, String color, String texture) {

        if(treeTypeCount == 99){
            System.out.println("TreeType limit reached");
            return null;
        }

        for (int i = 0; i < treeTypeCount; i++) {
            if(treeTypes[i] == null) {
                break;
            }
            if (treeTypes[i].name.equals(name) && treeTypes[i].color.equals(color) && treeTypes[i].texture.equals(texture)) {
                return treeTypes[i];
            }
        }
        treeTypes[treeTypeCount] = new TreeType(name, color, texture);
        treeTypeCount++;
        return treeTypes[treeTypeCount - 1];
    }
}
