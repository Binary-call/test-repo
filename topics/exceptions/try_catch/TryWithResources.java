package topics.exceptions.try_catch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TryWithResources {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        tryWithResource();
    }
    private static void tryWithResource() {
        try (Stream<String> lines = Files.lines(Paths.get("/home/aditya/Documents/Java_practice/Problems/FileHandle/file.txt"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
