package NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;

/**
 * Created by User on 11/8/2016.
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        try(RandomAccessFile inFile = new RandomAccessFile("D:/txt.txt", "r");
            RandomAccessFile outFile = new RandomAccessFile("D:/out.txt", "rw");

            FileChannel inChannel = inFile.getChannel();
            FileChannel outChannel = outFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(128);

            while (inChannel.read(buffer) != -1) {
/*                for (int i = 0; i < buffer.limit(); i++) {
                    System.out.print((char) buffer.get());
                }*/
                buffer.flip();
                outChannel.write(buffer);
                buffer.clear();
            }

            outChannel.close();
        }
    }
}
