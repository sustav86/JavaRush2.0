package task01.task0132;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(45));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
