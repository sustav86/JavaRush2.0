package task30.task3013;

/**
 * Created by ukr-sustavov on 27.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = Integer.MAX_VALUE - 133;
        System.out.println(Integer.toString(number, 2));

        String result = Integer.toString(solution.resetLowerBits(number), 2);
        System.out.println(result);

        System.out.println(3456 & ~(3456 >> 1));
        System.out.println(3456 & ((~3456) >>> 1));
        System.out.println(3456 >> 1);
        System.out.println((3456 << 1) & ~(3456));
        System.out.println(Integer.toBinaryString(3456));
        System.out.println(Integer.toBinaryString(~3456));
        System.out.println(Integer.toBinaryString(~3456 >> 1));
        System.out.println(Integer.toBinaryString(3456 >> 1));
    }

    public int resetLowerBits(int number) {
        number &= ~(number >> 1);
        number &= ~(number >> 2);
        number &= ~(number >> 4);
        number &= ~(number >> 8);
        number &= ~(number >> 16);
        return number;
    }
}
