package task36.task3610;

import java.io.Serializable;
import java.util.*;


/**
 * Created by ukr-sustavov on 18.08.2017.
 */
public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;
    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }
    @Override
    public int size() {
        return values().size();
    }
    @Override
    public V put(K key, V value) {
        List<V> values = map.get(key);
        V oldValue = null;
        if (values == null) {
            values = new ArrayList<>();
        } else {
            oldValue = values.get(values.size()-1);
            if (values.size() == repeatCount)
                values.remove(0);
        }
        values.add(value);
        map.put(key, values);
        return oldValue;
    }
    @Override
    public V remove(Object key) {
        if (containsKey(key)) {
            V value = map.get(key).get(0);
            map.get(key).remove(value);
            if (map.get(key).isEmpty()) {
                map.remove(key);
            }
            return value;
        }
        return null;
    }
    @Override
    public Set<K> keySet() {
        return map.keySet();
    }
    @Override
    public Collection<V> values() {
        ArrayList<V> values = new ArrayList<>();
        for (List<V> value : map.values()) {
            values.addAll(value);
        }
        return values;
    }
    @Override
    public boolean containsKey(Object key) {
        return keySet().contains(key);
    }
    @Override
    public boolean containsValue(Object value) {
        return values().contains(value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}
