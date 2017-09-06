package task31.task3110;

import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by ukr-sustavov on 17.08.2017.
 */
public class Archiver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Путь, архива:");
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(scanner.nextLine()));

        try {
            System.out.println("Путь, что будем архивировать:");
            zipFileManager.createZip(Paths.get(scanner.nextLine()));
        } catch (Exception e) {

        }
    }
}
