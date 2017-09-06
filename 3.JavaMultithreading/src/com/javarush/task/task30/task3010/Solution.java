package task30.task3010;

import task30.task3001.Number;

import java.math.BigInteger;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        BigInteger bigInteger;
        Boolean found = false;
//        BigInteger bigInteger = new BigInteger(args[0], 2);
//        BigInteger bigInteger = new BigInteger("12AS08z", 2);
//        System.out.println(bigInteger);
//        Converter("12AS08Z/", 2);
        for (int i = 2; i < 37; i++) {
            try {
                bigInteger = new BigInteger("12AS08z", i);
                System.out.println(i);
                found = true;
                break;
            }catch (Exception e) {

            }

        }
        if (!found) System.out.println("incorrect");
    }

    public static void Converter(String str, int base) {
        BigInteger bigInteger;
        if (base > 36) {
            System.out.println("incorrect");
        }else {
            try {
                bigInteger = new BigInteger(str, base);
                System.out.println(base);
            }catch (Exception e) {
                Converter(str, ++base);
            }
        }
    }
}
