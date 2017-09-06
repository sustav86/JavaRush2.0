package task31.task3105;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by ukr-sustavov on 23.06.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            return;
        }

        Map<String, ZipEntry> listOfFiles = new HashMap<>();
        String fileName = args[0];

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(args[1]))){

            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                listOfFiles.put(entry.getName(), entry);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(args[1]))){
            if (listOfFiles.containsKey(fileName)) {
                zipOutputStream.putNextEntry(new ZipEntry(fileName));
            }else {
                zipOutputStream.putNextEntry(new ZipEntry("new/" + fileName));
            }
            for (Map.Entry<String, ZipEntry> file : listOfFiles.entrySet()) {
                zipOutputStream.putNextEntry(new ZipEntry(file.getValue().getName()));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
