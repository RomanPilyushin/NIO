package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//4. Т5 - Скрыть существующий файл
public class T6 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/txt4.txt");
        Files.setAttribute(path, "dos:hidden", false);
    }
}
