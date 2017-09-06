package task31.task3107;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ukr-sustavov on 14.06.2017.
 */
public class Solution {
    private FileData fileData;

    public static void main(String[] args) {
        Solution solution = new Solution("src/task31.task3107/file.txt");
        FileData fileData = solution.getFileData();
        System.out.println(fileData.isWritable());
    }

    public Solution(String pathToFile) {

        try {
            Path file = Paths.get(pathToFile);
            fileData = new ConcreteFileData(Files.isHidden(file), Files.isExecutable(file), Files.isDirectory(file), Files.isWritable(file));
        }catch (Exception ex) {
            fileData = new NullFileData(ex);
        }

    }

    public FileData getFileData() {
        return fileData;
    }
}
