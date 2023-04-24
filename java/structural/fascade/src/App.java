import java.io.File;

import main.VideoConverter;

public class App {
    public static void main(String[] args) throws Exception {
        VideoConverter convertor = new VideoConverter();
        String inputFile = "/path/to/youtubevideo.mp4";
        System.out.println("\n\nInput file: " + inputFile);
        System.out.println("Converting...");
        File mp4 = convertor.convert(inputFile, "ogg");
        System.out.println("Output file: "+mp4);
    }
}
