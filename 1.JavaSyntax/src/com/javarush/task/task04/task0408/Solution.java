package task04.task0408;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a > 5) {
            System.out.println("Число больше 5");
        }else if (a < 5) {
            System.out.println("Число меньше 5");
        }else {
            System.out.println("Число равно 5");
        }
    }
}
