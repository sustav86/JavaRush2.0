package task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by ukr-sustavov on 17.05.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {


            Path password = getDownloadFile("http://www.amigo.com/ship/secretPassword.txt", Paths.get("C:\\Users\\ukr-sustavov\\Downloads\\234\\fu\\"));

            Files.readAllLines(password).forEach(System.out::println);



    }

    private static Path getDownloadFile(String urlString, Path downloadDirectory) throws IOException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("ukr-isa.ukr.eldorado.local", 8080));
        URLConnection url = new URL(urlString).openConnection(proxy);

        InputStream inputStream = url.getInputStream();

        Path tempFile = Files.createTempFile("temp-",".tmp1");

        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);

        if (!Files.exists(downloadDirectory)) {
            Files.createDirectories(downloadDirectory);
        }

        String fileName = urlString.substring(urlString.lastIndexOf("/")+1);

        Path absolutelyPath = Paths.get(downloadDirectory.toString() + "/" + fileName);

        Files.move(tempFile, absolutelyPath);

        return absolutelyPath;
    }
}
