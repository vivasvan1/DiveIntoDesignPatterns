public class AppConfigurator {
    private boolean enableEncryption;
    private boolean enableCompression;
    private DataSource source;

    AppConfigurator(boolean enableEncryption, boolean enableCompression) {
        this.enableEncryption = enableEncryption;
        this.enableCompression = enableCompression;
    }

    public void configure(String filename) {
        source = new FileDataSource(filename);

        if (enableEncryption) {
            source = new EncryptionDecorator(source);
        }
        if (enableCompression) {
            source = new CompressionDecorator(source);
        }

        SalaryManager logger = new SalaryManager(source);
        logger.save();
        String salary = logger.load();
        System.out.println("Salary: " + salary);
    }

}
