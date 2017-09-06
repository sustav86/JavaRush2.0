package task22.task2207;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ukr-sustavov on 31.07.2017.
 */
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
//        StringBuilder stringBuilder = new StringBuilder("рот");
//        System.out.println(stringBuilder.toString());
//        stringBuilder.reverse();
//        System.out.println(stringBuilder.toString());
//
//        String ss = "";
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("C:/Temp/1.txt"));
//            String s = null;
//            while ((s = reader.readLine()) != null) {
//                ss += s;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(ss);

//        Files.lines(Paths.get("C:/Temp/1.txt")).forEach(x -> System.out.println(x));
//        String s = new String(Files.readAllBytes(Paths.get("C:/Temp/1.txt")));
//        System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Temp/1.txt"), "Cp1251"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();
            List<String> list = Arrays.asList(everything.split(" "));
            StringBuilder stri = new StringBuilder();
            for (String str : list) {
                String revers = stri.append(str).reverse().toString();
                stri.delete(0, stri.length());
                for (String str2 : list) {
                    if (revers.equals(str2) && !str.equals(str2)) {
                        Pair pair = new Pair();
                        pair.first = str;
                        pair.second = str2;
                        if (!result.contains(pair)) {
                            result.add(pair);
                            break;
                        }
                    }
                }
            }

            for (Pair pair :
                    result) {
                System.out.println(pair);
            }
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if ((!first.equals(pair.first)) && (!first.equals(pair.second))) return false;
            return second.equals(pair.second) || second.equals(pair.first);

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }

        public Pair() {

        }
    }
}
