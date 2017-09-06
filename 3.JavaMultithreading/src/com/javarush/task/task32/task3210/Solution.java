package task32.task3210;


import java.io.RandomAccessFile;

/**
 * Created by ukr-sustavov on 19.06.2017.
 */
public class Solution {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw")) {
            randomAccessFile.seek(Integer.parseInt(args[1]));
            byte[] b = new byte[args[2].length()];

            randomAccessFile.read(b, 0, args[2].length());

            randomAccessFile.seek(args[0].length());

            String convertingString = convertByteToString(b);

            if (convertingString.equals(args[2])){
                randomAccessFile.write("true".getBytes());
            }else {
                randomAccessFile.write("false".getBytes());
            }

        }catch (Exception e) {


        }
    }

    public static String convertByteToString(byte[] readBytes) {
        return new String(readBytes);
    }
}
