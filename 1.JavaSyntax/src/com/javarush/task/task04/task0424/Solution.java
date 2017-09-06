package task04.task0424;

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
        if (Integer.compare(a, b) == 0 && Integer.compare(a, c) != 0 && Integer.compare(b, c) != 0) {
            System.out.println(c);
        }else if (Integer.compare(a, c) == 0 && Integer.compare(a, b) != 0 && Integer.compare(b, c) != 0) {
            System.out.println(b);
        }else if (Integer.compare(c, b) == 0 && Integer.compare(a, b) != 0 && Integer.compare(a, c) != 0) {
            System.out.println(a);
        }
    }
}
