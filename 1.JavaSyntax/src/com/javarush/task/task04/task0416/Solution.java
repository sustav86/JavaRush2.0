package task04.task0416;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double r = t % 5;
        if (r < 3 || t == 0) {
            System.out.println("зеленый");
        }else if (r >= 3 && r < 4) {
            System.out.println("желтый");
        }else {
            System.out.println("красный");
        }

    }
}
