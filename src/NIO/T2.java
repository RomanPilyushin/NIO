package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Date: 01.11.2016
 *
 * @author Michael Lang
 * @version 1.0
 */
public class T2 {
    public static void main(String[] args) throws IOException {

        ArrayList<Path> arrayListFiles = new ArrayList<>();

        Path dir = Files.createTempDirectory("dir_");
        Path file = Files.createTempFile(dir, "tmp_", ".txt");

        arrayListFiles.add(file);
        arrayListFiles.add(dir);

        ArrayList<CharSequence> lines = new ArrayList<>();
        lines.add("Hello World!");
        lines.add("Bbbbrrrrrrrrrrrrrr!");

        String[] linesArray = {"Hello World!", "Bbbbrrrrrrrrrrrrrr!"};
        List<String> asList = Arrays.asList(linesArray);

        Files.write(file, asList, StandardOpenOption.CREATE);

        Scanner scanner = new Scanner(System.in);
        do {
            if(scanner.nextLine().equals("exit")) {
                for (Path listFile : arrayListFiles) {
                    if (Files.isRegularFile(listFile)) {
                        Files.delete(listFile);
                    }
                }

                for (Path listFile : arrayListFiles) {
                    if (Files.isDirectory(listFile)) {
                        Files.delete(listFile);
                    }
                }

                break;
            }
        } while (true);
    }
}
