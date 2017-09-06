package task31.task3109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by ukr-sustavov on 14.06.2017.
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/task31.task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/task31.task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/task31.task3109/notExists");
        properties.list(System.out);

    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try {
            if (fileName.endsWith(".xml")) {
                properties.loadFromXML(new FileInputStream(fileName));
            }else {
                properties.load(new FileReader(new File(fileName)));
            }
        } catch (IOException e) {
            properties = new Properties();
        }
        return properties;
    }

}
