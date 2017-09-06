package task34.task3402;

/**
 * Created by ukr-sustavov on 27.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.factorial(9));     //362880
        System.out.println(solution.factorial(0));     //1
        System.out.println(solution.factorial(1));     //1
        System.out.println(solution.factorial(5));     //1
    }

    public int factorial(int n) {

        while (n > 0) {

            return n * factorial(n - 1);
        }

        return 1;

    }
}
