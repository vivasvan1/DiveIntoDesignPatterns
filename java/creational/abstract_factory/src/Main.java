import java.util.Scanner;

import interfaces.IButton;
import web.WebFactory;
import windows.WindowsFactory;

public class Main {
    static App app;

    public static void initialize() throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            line = line.strip();
            if (line.equals("Windows")) {
                app = new App(new WindowsFactory());
            } else if (line.equals("Web")) {
                app = new App(new WebFactory());
            } else {
                throw new Exception("Invalid OS");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        initialize();
        app.createUI();
        app.render();
    }
}
