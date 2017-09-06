package task03.task0312;

/**
 * Created by ukr-sustavov on 30.06.2017.
 */
public class Solution {

    public static int convertToSeconds(int par) {
        return par * 3600;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(convertToSeconds(4));
        }

    }
}
