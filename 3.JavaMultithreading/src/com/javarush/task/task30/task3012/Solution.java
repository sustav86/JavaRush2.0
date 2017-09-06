package task30.task3012;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 02.08.2017.
 */
public class Solution {
    static List<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(74);

        System.out.println(array);
    }

    public void createExpression(int number) {
        int num = number % 3;

        if (number < 3) {
            return;
        }

        if (num == 0) {
            array.add(0);
        }else if (num == 2) {
            array.add(-(num + 1));
        }else if (num == 1) {
            array.add(num);
        }

        createExpression(number / 3);
    }
}
