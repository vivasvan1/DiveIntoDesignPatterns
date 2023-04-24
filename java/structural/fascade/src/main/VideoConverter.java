package main;

import java.io.File;

import complex_modules.AudioMixer;
import complex_modules.BitrateReader;
import complex_modules.CodecFactory;
import complex_modules.MPEG4CompressionCodec;
import complex_modules.OggCompressionCodec;

public class VideoConverter {

    public VideoConverter() {

    }

    public File convert(String filename, String format) {

        // Use all the complex classes here

        VideoFile videoFile = new VideoFile(filename);
        String sourceCodec = new CodecFactory().extract(videoFile);
        String destinationCodec;
        if (format == "mp4") {
            destinationCodec = new MPEG4CompressionCodec().getDestinationCodec();
        } else {
            destinationCodec = new OggCompressionCodec().getDestinationCodec();
        }
        String buffer = BitrateReader.read(filename, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);

        result = (new AudioMixer()).fix(result);
        int i = filename.lastIndexOf('.');
        String extension = "";
        if (i > 0) {
            extension = filename.substring(i + 1);
        }
        return new File(filename.substring(0, filename.length() - extension.length()) + format);
    }
}
