public class Database {
    private static Database instance = null;

    private Database () {
        // Exists only to defeat instantiation.
    }

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        // ...
    }
}
