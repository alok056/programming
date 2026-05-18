package javademo.core.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        Path dir = Files.createTempDirectory("javademo-core");
        Path file = dir.resolve("sample.txt");

        /************************************
         *  Write to file                   *
         ************************************/

        List<String> lines = List.of("Line 1: Hello", "Line 2: Java Core", "Line 3: File handling");
        Files.write(file, lines);
        System.out.println("Written to: " + file);

        /************************************
         *  Read from file                  *
         ************************************/

        List<String> readLines = Files.readAllLines(file);
        System.out.println("Read lines:");
        readLines.forEach(line -> System.out.println("  " + line));

        /************************************
         *  File metadata                   *
         ************************************/

        System.out.println("exists: " + Files.exists(file));
        System.out.println("size bytes: " + Files.size(file));

        /************************************
         *  Delete file                     *
         ************************************/

        Files.delete(file);
        Files.delete(dir);
        System.out.println("Cleaned up temp file and directory");
    }
}
