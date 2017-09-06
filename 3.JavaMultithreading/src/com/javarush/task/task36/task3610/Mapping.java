package task36.task3610;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by ukr-sustavov on 18.08.2017.
 */
public class Mapping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map.compute("A",  (k, v) -> v == null ? 45 : v + 41));
        System.out.println(map);

        map.compute("B", new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                if (integer != null) {

                }

                return null;
            }
        });

    }
}
