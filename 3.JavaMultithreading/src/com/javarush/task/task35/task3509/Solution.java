package task35.task3509;

import java.util.*;

/**
 * Created by ukr-sustavov on 04.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> result = new ArrayList<>(Arrays.asList(elements));
        return result;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> result = new HashSet<>(Arrays.asList(elements));

        return result;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
        HashMap<K, V> result = new HashMap<>();

        for(int i = 0; i < keys.size(); i++) result.put(keys.get(i), values.get(i));

        return result;
    }
}
