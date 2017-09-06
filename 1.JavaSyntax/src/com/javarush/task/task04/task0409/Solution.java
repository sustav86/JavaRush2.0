package task04.task0409;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
        closeToTen(9, 11);
    }

    public static void closeToTen(int a, int b) {
        System.out.println(abs(a - 10) < abs(b - 10)? a: b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
