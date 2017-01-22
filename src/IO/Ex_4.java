package IO;

import java.io.*;

/**
 * Date: 16.10.2016
 *
 * @author Michael Lang
 * @version 1.0
 */
public class Ex_4 {
    public static void main(String[] args) throws IOException {
        File file = new File("scr/IO/index.html");
        File outFile = new File("scr/IO/index2.html");
        PushbackInputStream pushback = new PushbackInputStream(new FileInputStream(file), 5);
        // TODO: 16.10.2016 PrintStream запись в другой файл
        PrintStream ps = new PrintStream(outFile);
        
        int b;
        byte[] bytes = new byte[3];
        String s = "";
        while((b = pushback.read()) != -1) {
            switch (b) {
                case '<' :
                    pushback.read(bytes);
                    boolean equals = new String(bytes).equals("div");
                    if (equals) {
                        // TODO: 16.10.2016 Unread (и флаг) и замена div на span 
                    }
                    break;
                // TODO: 16.10.2016
            }
        }
    }
}
