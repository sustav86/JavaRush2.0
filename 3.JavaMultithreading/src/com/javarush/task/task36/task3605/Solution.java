package task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by ukr-sustavov on 16.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
//        if (args.length == 0) {
//            return;
//        }
//
//        TreeSet<String> tree = new TreeSet<>(String::compareToIgnoreCase);
//        TreeSet<String> tree2 = new TreeSet<>(String::compareToIgnoreCase);
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
//            List<String> list = bufferedReader.lines().collect(Collectors.toList());
//            for (String lt : list) {
//                lt.chars().filter(i -> (i >= 65 && i <= 90) || (i >= 97 && i <= 122)).forEach(e -> tree.add(String.valueOf((char)e).toLowerCase()));
//            }
//
//            for (String str : tree) {
//                tree2.add(str);
//            }
//            tree2.stream().limit(5).forEach(System.out::print);
//        }


        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeSet<String> set  = new TreeSet<>();
        String s;
        while ((s=reader.readLine())!=null){
            char[] s1 = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
            for (char m:s1){
                set.add(String.valueOf(m).toLowerCase());
            }
        }
        int m=0;
        for (String s1 : set) {
            if(m==5)break;
            System.out.print(s1);
            m++;
        }
        reader.close();

    }
}
