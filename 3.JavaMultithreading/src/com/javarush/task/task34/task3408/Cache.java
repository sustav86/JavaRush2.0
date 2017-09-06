package task34.task3408;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;


/**
 * Created by ukr-sustavov on 28.07.2017.
 */
public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here

    public V getByKey(K key, Class<V> clazz) throws Exception {
        if (!cache.containsKey(key))
            cache.put(key, clazz.getConstructor(key.getClass()).newInstance(key));
        return cache.get(key);
    }

    public boolean put(V obj) {
        Method getKey = null;
        try {
            getKey = obj.getClass().getDeclaredMethod("getKey");
            getKey.setAccessible(true);
            K key = (K) getKey.invoke(obj);
            cache.put(key, obj);
            return true;

        } catch (Exception e) {

        }

        return false;

    }

    public int size() {
        return cache.size();
    }
}
