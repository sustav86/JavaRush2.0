package task01.task0130;

/**
 * Created by ukr-sustavov on 30.06.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        return (double) celsium * 9/5 + 32;
    }
}
