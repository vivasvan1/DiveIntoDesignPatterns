import java.util.Scanner;

import factory.Factory;
import factory.FactoryA;
import factory.FactoryB;

public class App {
    static Factory factory;

    static void initialize() throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter A or B");
            String line = scanner.nextLine();
            line = line.strip();
            if (line.equals("A")) {
                factory = new FactoryA();
            } else if (line.equals("B")) {
                factory = new FactoryB();
            } else {
                throw new Exception("Invalid input");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        initialize();
        factory.someOperation();

    }
}
