package task04.task0429;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            list.add(scanner.nextInt());
//        }
//
//        long a = list.stream().filter(x -> x < 0).count();
//        long b = list.stream().filter(x -> x > 0).count();
//
//        System.out.println("Количество отрицательных чисел: " + a);
//        System.out.println("Количество положительных чисел: " + b);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int countPositive = 0;
        int countNegative = 0;
        int[] array = {a, b, c};
        for (int i : array) {
            if (i < 0) {
                if (i == 0) {
                    continue;
                }
                countNegative++;
            } else if (i > 0) {
                countPositive++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
