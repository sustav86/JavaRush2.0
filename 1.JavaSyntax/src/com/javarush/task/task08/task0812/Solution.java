package task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by ukr-sustavov on 05.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                int d = map.getOrDefault(list.get(i), 1);
                map.put(list.get(i), ++d);
            }
        }

        long max = 1;

        for (Map.Entry<Integer, Integer> k: map.entrySet()){
            if (k.getValue() > max) {
                max = k.getValue();
            }
        }

        System.out.println(max);

    }
}
