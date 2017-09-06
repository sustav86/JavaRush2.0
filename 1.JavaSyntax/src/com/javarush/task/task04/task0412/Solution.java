package task04.task0412;

import java.util.Scanner;

/**
 * Created by ukr-sustavov on 03.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(2 * num);
        }else if (num < 0) {
            System.out.println(++num);
        }else {
            System.out.println(0);
        }
    }
}
