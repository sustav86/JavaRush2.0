package task31.task3113;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Scanner;

/**
 * Created by ukr-sustavov on 17.05.2017.
 * SUCCESSFULLY
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String folder = scanner.nextLine();
        // if (folder.equals("")) {
        //     return;
        // }

        Path path = Paths.get(folder);
        if (!Files.isDirectory(path)) {
            System.out.println(path.toAbsolutePath() + " - не папка");
            return;
        }

        PrintFiles printFiles = new PrintFiles();
        printFiles.setCurrentDir(path);

        Files.walkFileTree(path, EnumSet.of(FileVisitOption.FOLLOW_LINKS), Integer.MAX_VALUE, printFiles);

        System.out.println("Всего папок - " + (printFiles.getFolders() - 1));
        System.out.println("Всего файлов - " + printFiles.getFiles());
        System.out.println("Общий размер - " + printFiles.getCommonFilesLength());

    }
}

class PrintFiles extends SimpleFileVisitor<Path> {

    private int folders;
    private int files;
    private long commonFilesLength;
    private Path currentDir;

    public int getFolders() {
        return folders;
    }

    public int getFiles() {
        return files;
    }

    public long getCommonFilesLength() {
        return commonFilesLength;
    }

    public void setCurrentDir(Path currentDir) {
        this.currentDir = currentDir;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        files++;
        commonFilesLength += Files.size(file);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        // if (dir.getParent().toString().equals(currentDir.toString())) {
        folders++;
        // }

        return FileVisitResult.CONTINUE;
    }
}
