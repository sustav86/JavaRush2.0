package task08.task0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ukr-sustavov on 05.07.2017.
 */
public class Solution {
    public static Map<String, Integer> map;

    public static Map<String, Integer> createMap() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            for (int i = 0; i < 3; i++) {
                map.put(reader.readLine(), Integer.parseInt(reader.readLine()));
            }
        }catch (Exception e) {

        }

        return map;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.values().removeIf(x -> x < 500);
    }

    public static void main(String[] args) {
        Map<String, Integer> m = createMap();
        removeItemFromMap(m);
        System.out.println(m);

    }
}
