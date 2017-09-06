package task31.task3101;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by ukr-sustavov on 22.05.2017.
 */
public class Solution {
    private static Map<String, File> tree = new TreeMap<>();

    public static void main(String[] args) {

        if (args.length < 1) {
            return;
        }

        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File destination = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");

        FileUtils.renameFile(resultFileAbsolutePath, destination);

        try (FileOutputStream outputStream = new FileOutputStream(destination)) {
            walkingAroundFolder(path.toString());
            for (Map.Entry<String, File> entry : tree.entrySet()) {
                try (FileInputStream inputStream = new FileInputStream(entry.getValue().getAbsoluteFile())) {
                    while (inputStream.available() > 0) {
                        outputStream.write(inputStream.read());
                    }
                    outputStream.write("\n".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {

        }

    }

    public static void walkingAroundFolder(String path) {
        File folder = new File(path);
        try {
            for (File file : folder.listFiles()) {
                if (file.isDirectory()) {
                    walkingAroundFolder(file.getPath());
                } else {
                    if (file.length() > 50) {
                        FileUtils.deleteFile(file);
                    }else {
                        tree.put(file.getName(), file);
                    }
                }
            }
        }catch (NullPointerException ex) {

        }
    }
}
