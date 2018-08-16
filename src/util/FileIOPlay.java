package util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class FileIOPlay {
    public static void main(String[] args) throws IOException {
        Files.createDirectory(Paths.get("./src/test"));

//        Files.isDirectory();
    }
}

