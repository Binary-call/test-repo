package topics.exceptions.try_catch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class UseTryCatch {
        public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        readTextWithSimpleFile();
    }
    private static void readTextWithSimpleFile() {
        try {
            Object directory = new File(System.getProperty("user.dir")).getAbsolutePath();
            Path path = Paths.get(directory + "/Problems/FileHandle/file.txt");
            if (Files.exists(path)) {
                Stream<String> lines = Files.lines(path);
                lines.forEach(System.out::println);
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
