package task35.task3511;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Solution {
    public static void main(String[] args){
        List<Integer> listNum = new ArrayList<>();
        listNum.add(5);
        listNum.add(6);
        System.out.println(sum(listNum));
        multiply(listNum);
        concat(listNum);


    }

    public static Double sum(List<? extends Number> list) {
        Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result += numb.doubleValue();
        }
        return result;
    }

    public static Double multiply(List<? extends Number> list) {
        Double result = 1.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result *= numb.doubleValue();
        }
        return result;
    }

    public static String concat(List<?> list) {
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static List combine(List<? extends Collection> list) {
        List result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Collection collection = list.get(i);
            result.addAll(collection);
        }
        return result;
    }
}
