public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
        System.out.println("Compressing data");
        // TODO: Compress data
        String compressed_data = data;
        super.writeData(compressed_data);
    }

    public String readData() {
        String data = super.readData();
        System.out.println("Decompressing data");
        // TODO: Decompress data
        String uncompressed_data = data;
        return uncompressed_data;
    }

}
