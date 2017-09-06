package task31.task3106;

import java.io.*;
import java.util.Arrays;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by ukr-sustavov on 27.06.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        File resultFileName = new File(args[0]);
        String[] partsOfZip = Arrays.copyOfRange(args, 1, args.length);
        Arrays.sort(partsOfZip);

        Vector<FileInputStream> list = new Vector<>();
        for (int i = 0; i < partsOfZip.length; i++) {
              list.add(new FileInputStream(partsOfZip[i]));

        }

        try (ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(list.elements()));
             FileOutputStream outputStream = new FileOutputStream(resultFileName)){

            byte[] buffer = new byte[1024];
            int l;
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                while ((l = zipInputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, l);
                    outputStream.flush();
                }

//                outputStream.write(zipEntry.getExtra());
            }

        }


    }
}
