package task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

/**
 * Created by ukr-sustavov on 23.06.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor Dpljr");
        System.out.println(decode(reader, -3));  //Hello Amigo
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader == null) {
            return new String();
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringWriter stringWriter = new StringWriter();
        int sim;
        while ((sim = bufferedReader.read()) > 0) {
            stringWriter.write(sim + key);
        }

        return stringWriter.toString();


//        char[] buff = new char[reader.toString().length()];
//        reader.read(buff);
//        for (int i = 0; i < buff.length; i++) {
//            buff[i] += key;
//        }
//
//        return new String(buff);
    }
}
