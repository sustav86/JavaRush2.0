package task04.task0414;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 100 == 0 && num % 400 != 0 && num % 4 == 0) {
            System.out.println("количество дней в году: 365");
        }else if (num % 4 == 0) {
            System.out.println("количество дней в году: 366");
        }else {
            System.out.println("количество дней в году: 365");
        }

    }
}
