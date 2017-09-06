package task29.task2913;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class Solution {
    private static int numberA;
    private static int numberB;

    public static String recursion(int a, int b) {
        if (a > b) {
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }

    public static String getAllNumbersBetween(int a, int b) {
//        if (a < b) {
//            for (int i = a; i < b; i++) {
//                System.out.println(a++);
//            }
//        }else if (a > b) {
//            for (int i = b; i < a; i++) {
//                System.out.println(b++);
//            }
//        }else {
//            System.out.println(a);
//        }
        StringBuilder result = new StringBuilder();
        IntStream.
                iterate(a, i -> (a <= b) ? (i+1) : (i-1)).
                limit((a <= b) ? (b - a + 1) : (a - b + 1)).
                forEach(i -> result.append(" ").append(i));
        String resultString = result.substring(1, result.length());
        return resultString;
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt() % 1_000;
        numberB = random.nextInt() % 10_000;
//        System.out.println(recursion(numberA, numberB));
//        System.out.println(recursion(numberB, numberA));

        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}
