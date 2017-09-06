package task05.task0507;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int i = 0;
        double sum = 0;
        while ((x = scanner.nextInt()) != -1) {
            i++;
            sum += x;
        }

        System.out.println(sum / i);
    }
}
