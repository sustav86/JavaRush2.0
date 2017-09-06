package task06.task0606;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);;
        String line = scanner.nextLine();
        int n;
        for(char c : line.toCharArray()) {
            n = Character.getNumericValue(c);
            if (n % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
