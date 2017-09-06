package task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] houses = new int[15];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            for (int i = 0; i < houses.length; i++) {
                houses[i] = Integer.parseInt(reader.readLine());
            }

            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            IntStream.range(0, houses.length).filter(i -> i % 2 == 0).forEach(x -> even.add(houses[x]));
            IntStream.range(0, houses.length).filter(i -> i % 2 != 0).forEach(x -> odd.add(houses[x]));

            int sumEven = even.stream().reduce(0, Integer::sum);
            int sumOdd = odd.stream().reduce(0, Integer::sum);

            System.out.println(sumEven > sumOdd? "В домах с четными номерами проживает больше жителей.": "В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
