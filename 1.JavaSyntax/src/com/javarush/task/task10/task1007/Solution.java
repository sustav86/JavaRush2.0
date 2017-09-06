package com.javarush.task.task10.task1007;

/**
 * Created by ukr-sustavov on 07.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        long l = 111_1111_111_110L;
        System.out.println("l = " + l);

        int x = 0b1000_1100_1010;
        System.out.println("x = " + x);

        double m = 110_987_654_6299.123_34;
        System.out.println("m = " + m);

        float f = l++ + 10 + (float)++x - (float)m;
        System.out.println("f = " + f);

        l = (byte) f / (byte)1000;
        System.out.println(l);
    }
}
