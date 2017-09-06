package task04.task0417;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (Integer.compare(a, b) == 0 && Integer.compare(a, c) == 0) {
            System.out.println(a + " " + b + " " + c);
        }else if (Integer.compare(a, b) == 0) {
            System.out.println(a + " " + b);
        }else if (Integer.compare(a, c) == 0) {
            System.out.println(a + " " + c);
        }else if (Integer.compare(c, b) == 0) {
            System.out.println(c + " " + b);
        }
    }
}
