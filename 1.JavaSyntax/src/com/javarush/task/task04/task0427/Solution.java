package task04.task0427;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x < 1 || x > 999) {
            return;
        }

        if (x % 2 == 0) {
            System.out.print("четное ");
        }else {
            System.out.print("нечетное ");
        }

        int num = (int)Math.ceil(Math.log10(x + 0.5));

        if (num == 1) {
            System.out.print("однозначное число");
        }else if (num == 2) {
            System.out.print("двузначное число");
        }else {
            System.out.print("трехзначное число");
        }
    }
}
