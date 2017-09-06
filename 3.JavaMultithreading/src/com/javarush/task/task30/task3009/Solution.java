package task30.task3009;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ukr-sustavov on 02.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        Set<Integer> set = new HashSet<>();

        String num;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 2; i < 37; i++) {
            try {
                num = Integer.toString(Integer.parseInt(number), i);
                stringBuilder = stringBuilder.append(num).reverse();
                if (num.equals(stringBuilder.toString())) {
                    set.add(i);
                }
                stringBuilder.delete(0, stringBuilder.length());
            }catch (NumberFormatException e) {

            }
        }

        return set;
    }
}
