package task34.task3403;

/**
 * Created by ukr-sustavov on 27.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recursion(132);
    }
    public void recursion(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                recursion(n / i);
                break;
            }
        }
    }
}
