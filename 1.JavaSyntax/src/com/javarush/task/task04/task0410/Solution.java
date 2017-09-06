package task04.task0410;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        System.out.println(a >= 50 && a <= 100? "Число " + a + " содержится в интервале.": "Число " + a + " не содержится в интервале.");
    }
}
