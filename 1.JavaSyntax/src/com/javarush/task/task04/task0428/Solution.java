package task04.task0428;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list.stream().filter(x -> x > 0).count());
    }
}
