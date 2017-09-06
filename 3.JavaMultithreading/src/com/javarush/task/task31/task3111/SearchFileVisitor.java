package task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        boolean fileFound = true;

        if (Files.exists(file) && !Files.isDirectory(file)) {
            long fileSize = Files.size(file);

            if (partOfName != null && !file.getFileName().toString().contains(partOfName)) {
                fileFound = false;
            }


            if (minSize != 0 && fileSize <= minSize) {
                fileFound = false;
            }

            if (maxSize != 0 && fileSize >= maxSize) {
                fileFound = false;
            }


            String fileToString = new String(Files.readAllBytes(file));
            if (partOfContent != null && !fileToString.contains(partOfContent)) {
                fileFound = false;
            }

        } else {
            fileFound = false;
        }

        if (fileFound) {
            foundFiles.add(file);
        }

        return FileVisitResult.CONTINUE;

    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

}
