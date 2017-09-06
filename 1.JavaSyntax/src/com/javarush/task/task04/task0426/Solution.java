package task04.task0426;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 0) {
            System.out.println("ноль");
            return;
        }

        if (x < 0) {
            System.out.print("отрицательное ");
        }else {
            System.out.print("положительное ");
        }

        if (x % 2 == 0) {
            System.out.print("четное число");
        }else {
            System.out.print("нечетное число");
        }

    }
}
