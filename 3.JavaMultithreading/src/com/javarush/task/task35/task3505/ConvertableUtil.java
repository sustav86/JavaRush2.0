package task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class ConvertableUtil {
    public static <K, V extends Convertable<K>> Map<K, V> convert(List<? extends Convertable<K>> list) {
        Map<K, V> result = new HashMap();

        for (int i = 0; i < list.size(); i++) {
            Convertable<K> element = list.get(i);

            result.put(element.getKey(), (V) element);
        }
        return result;
    }
}
