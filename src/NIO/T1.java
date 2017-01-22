package NIO;

import java.nio.ByteBuffer;

/**
 * Date: 01.11.2016
 *
 * @author Michael Lang
 * @version 1.0
 */
public class T1 {
    public static void main(String[] args) {
        char[] chars = new char[]{
            'H', 'e', 'l', 'l', 'o'
        };

        ByteBuffer bb = ByteBuffer.allocate(256);

        bb.putChar(15, 'U'); // pos = 0, lim = 15, mark = -1

        for (char c : chars) {
            bb.putChar(c); // pos = 9, lim = 9, mark = -1
        }

        bb.flip(); // pos = 0, lim = pos = 9, mark = -1

        int remaining = bb.remaining();
        for (int i = 0; i < remaining / 2; i++) {
            System.out.print(bb.getChar()); // pos = i = 9, lim = 9, mark = -1
        }
        System.out.println();


        bb.limit(bb.limit() + 2);
        bb.putChar('T'); // pos = 11, lim = 11

        int remaining2 =  bb.position(0).remaining();
        for (int i = 0; i < remaining2 / 2; i++) {
            System.out.print(bb.getChar());
        }
        System.out.println();
    }
}
