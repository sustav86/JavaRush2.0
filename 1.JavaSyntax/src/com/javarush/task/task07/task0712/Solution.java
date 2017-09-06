package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 05.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 10; i++) {
                list.add(reader.readLine());
            }

            int indexLongest = 0;
            int indexShortest = 0;
            String longestWord = list.get(0);
            String shortestWord = list.get(0);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() > longestWord.length()) {
                    longestWord = list.get(i);
                    indexLongest = i;
                }

                if (list.get(i).length() < shortestWord.length()) {
                    shortestWord = list.get(i);
                    indexShortest = i;
                }
            }

            if (indexShortest < indexLongest) {
                System.out.println(shortestWord);
            }else {
                System.out.println(longestWord);
            }

        }
    }
}
