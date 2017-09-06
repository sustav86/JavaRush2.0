package task32.task3202;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * Created by ukr-sustavov on 23.06.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {

        StringWriter stringWriter = new StringWriter();

        if (is == null) {
            return stringWriter;
        }

        while (is.available() > 0) {
            stringWriter.write(is.read());
        }

        return stringWriter;
    }
}
