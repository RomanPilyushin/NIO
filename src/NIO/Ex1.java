package NIO;

import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Date: 28.10.2016
 *
 * @author Michael Lang
 * @version 1.0
 */
public class Ex1 {
    public static void main(String[] args) {
        ByteBuffer allocate = ByteBuffer.allocate(2048);
        allocate.put(new byte[]{1, 2 ,3});
        System.out.println(allocate);
        allocate.rewind();
        allocate.flip();
        allocate.clear();
        allocate.reset();
        Path path = Paths.get("D:/");

/*        int[] scr = new int[900 * 900];

        for (int i = 0; i < 900; i++) {
            int[] str = new int[900];
            System.arraycopy(scr, 900 * i, str, 0, 900);
        }*/


    }
}
