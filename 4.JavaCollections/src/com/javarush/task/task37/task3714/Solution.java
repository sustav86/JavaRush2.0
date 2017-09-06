package task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int currentNumber = 0;
        int previousNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.toUpperCase().charAt(i)) {
                case 'I': currentNumber = 1; break;
                case 'V': currentNumber = 5; break;
                case 'X': currentNumber = 10; break;
                case 'L': currentNumber = 50; break;
                case 'C': currentNumber = 100; break;
                case 'D': currentNumber = 500; break;
                case 'M': currentNumber = 1000; break;
            }

            if (currentNumber > previousNumber) {
                result -= 2 *previousNumber;
            }

            result += currentNumber;

            previousNumber = currentNumber;

        }

        return result;
//        List<Character> list = s.chars().mapToObj(i -> (char)i).collect(Collectors.toList());
//        int previousNumber = 0;
//        int currentNumber;
//        int result = 0;
//        for (int i = 1; i < list.size(); i++) {
//            if (previousNumber == 0) {
//                previousNumber = getNumber(list.get(i - 1));
//            }
//            currentNumber = getNumber(list.get(i));
//
//
//            if (result == 0) {
//                result = previousNumber + currentNumber;
//            }else {
//                result += currentNumber;
//            }
//
//            if (currentNumber > previousNumber) {
//                result -= 2 * previousNumber;
//            }
//
//            previousNumber = currentNumber;
//        }
//
//        return result;

    }

//    public static int getNumber(Character ch) {
//        switch (Character.toUpperCase(ch)) {
//            case 'I' :
//                return 1;
//            case 'V' :
//                return 5;
//            case 'X' :
//                return 10;
//            case 'L' :
//                return 50;
//            case 'C' :
//                return 100;
//            case 'D' :
//                return 500;
//            case 'M' :
//                return 1000;
//            default:
//                return 0;
//        }
//    }
}
