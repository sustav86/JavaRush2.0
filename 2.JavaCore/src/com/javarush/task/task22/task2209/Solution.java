package task22.task2209;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ukr-sustavov on 01.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        //...
        StringBuilder result = getLine("Киев", "Нью-Йорк", "Амстердам", "Вена", "Мельбурн", "Гамбург", "Ель");
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder stringBuilder = new StringBuilder();

        if (words.length == 0) {
            return stringBuilder;
        }

        List<String> list = Arrays.asList(words);
        while (true) {
            for (int i = 0; i < list.size() - 1; i++) {
                String firstWord = list.get(i);
                String secondWord = list.get(i+1);
                if (!firstWord.substring(firstWord.length() -1, firstWord.length()).equalsIgnoreCase(secondWord.substring(0, 1))) {
                    Collections.shuffle(list);
                    i = 0;
                }
            }
            break;
        }

        return stringBuilder.append(list);
    }
}
