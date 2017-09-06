package task31.task3108;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ukr-sustavov on 15.06.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Path path1 = Paths.get("D:/test/data/firstDir");
        Path path2 = Paths.get("D:/test/data/secondDir/third");
        Path resultPath = getDiffBetweenTwoPaths(path1, path2);
        System.out.println(resultPath);   //expected output '../secondDir/third' or '..\secondDir\third'
    }

    public static Path getDiffBetweenTwoPaths(Path path1, Path path2) {
        return path1.relativize(path2);
    }
}
