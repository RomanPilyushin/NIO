package NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//1. Т3 считать атрибуты(readAttributes()) использовать BasicFileAttributes.
public class T5 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/txt3.txt");
        final BasicFileAttributes x = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(x.creationTime());
    }
}
