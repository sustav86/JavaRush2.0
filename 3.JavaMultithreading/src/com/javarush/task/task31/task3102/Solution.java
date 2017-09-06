package task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by ukr-sustavov on 24.05.2017.
 * SUCCESSFULLY
 */
public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println(getFileTree("C:\\Users\\ukr-sustavov\\Documents\\bbase"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();
        Queue<File> pathQueue = new LinkedBlockingQueue<>();

        pathQueue.add(new File(root));

        while (!pathQueue.isEmpty()) {
            File folder = pathQueue.poll();
            if (folder != null) {
                if (folder.isDirectory()) {
                    for (File file :
                            folder.listFiles()) {
                        if (folder.isDirectory()) {
                            pathQueue.offer(file);
                        } else {
                            result.add(file.getAbsolutePath());
                        }
                    }
                } else {
                    result.add(folder.getAbsolutePath());
                }
            }
        }

        return result;

    }
}
