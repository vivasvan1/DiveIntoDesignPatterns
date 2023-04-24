import java.io.File; // Import the File class
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; // Import the IOException class to handle errors
import java.nio.charset.StandardCharsets;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {
        // Write data to file
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
                myObj.delete();
                myObj.createNewFile();
            }

            byte[] dataAsByte = data.getBytes();
            FileOutputStream keyfos = new FileOutputStream(filename);
            keyfos.write(dataAsByte);
            keyfos.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public String readData() {

        String output = "";
        try {
            FileInputStream encryptedTextFis = new FileInputStream(filename);
            byte[] encText = new byte[encryptedTextFis.available()];
            encryptedTextFis.read(encText);
            encryptedTextFis.close();
            return new String(encText, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return output;
    }
}
