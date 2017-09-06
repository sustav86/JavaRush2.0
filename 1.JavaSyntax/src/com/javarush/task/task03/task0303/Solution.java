package task03.task0303;

/**
 * Created by ukr-sustavov on 30.06.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(47, 30));
        System.out.println(convertEurToUsd(47, 29.9));

    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }
}
