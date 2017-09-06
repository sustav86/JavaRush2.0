package task32.task3201;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by ukr-sustavov on 16.06.2017.
 */
public class Solution {
    public static void main(String... args) {
        if (args.length < 3) {
            return;
        }
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw")) {
            randomAccessFile.seek(number);
            byte[] b = new byte[text.length()];
            randomAccessFile.read(b, 0, text.length());
            String convertingString = convertByteToString(b);
            randomAccessFile.seek(randomAccessFile.length());
            if (convertingString == null || text == null) {
                randomAccessFile.write("false".getBytes());
            } else if (convertingString.equals(text)) {
                randomAccessFile.write("true".getBytes());
            } else {
                randomAccessFile.write("false".getBytes());
            }
        } catch (Exception e) {
        }
    }

    public static String convertByteToString(byte[] readBytes) {
        return new String(readBytes);
    }
}
