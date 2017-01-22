package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//3. Т4 - Создать временный файл и ярлык на него на рабочем столе.
public class T4 {
    public static void main(String[] args) {
        Path records = Paths.get("D:/txt3.txt");

        Path recordsLink = Paths.get("D:/hello.lnk");

        records = Paths.get(records.toAbsolutePath().toString());
        try {
            //Files.createSymbolicLink(recordsLink, records);
            Files.createLink(recordsLink, records);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
