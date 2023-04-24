public class App {
    public static void main(String[] args) throws Exception {

        // Option 1: Use the decorator to encrypt the data
        // FileDataSource fileDataSource = new FileDataSource("test.txt");
        // EncryptionDecorator encryptionDecorator = new
        // EncryptionDecorator(fileDataSource);
        // encryptionDecorator.writeData("This is a test");
        // System.out.println(encryptionDecorator.readData());

        // Option 2: Use the configurator
        // AppConfigurator appConfigurator = new AppConfigurator(true, false);
        // appConfigurator.configure("./salary.dat");
    }
}
