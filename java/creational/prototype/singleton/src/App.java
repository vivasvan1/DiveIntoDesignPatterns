public class App {
    public static void main(String[] args) throws Exception {
        Database db = Database.getInstance();
        db.query("SELECT * FROM table");

        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM table");

        System.out.println("db == db2: " + (db == db2));
        // db and db2 are the same instance
    }
}
