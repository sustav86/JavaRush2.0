package task30.task3001;

import java.math.BigInteger;

/**
 * Created by ukr-sustavov on 11.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Number number = new Number(NumerationSystemType._10, "6");
        Number result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._2);
        System.out.println(result);    //expected 110

        number = new Number(NumerationSystemType._16, "6df");
        result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._8);
        System.out.println(result);    //expected 3337

        number = new Number(NumerationSystemType._10, "6df");
        result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._2);
        System.out.println(result);    //expected 3337
    }

    public static Number convertNumberToOtherNumerationSystem(Number number, NumerationSystem expectedNumerationSystem) {

//        BigInteger num;
//        try {
//            num = new BigInteger(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue());
//        }catch (Exception e) {
//            throw new NumberFormatException();
//        }
//
////        return new Number(expectedNumerationSystem, new BigInteger(number.getDigit(), expectedNumerationSystem.getNumerationSystemIntValue()).toString());
//        return new Number(expectedNumerationSystem, Integer.toString(Integer.parseInt(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue()), expectedNumerationSystem.getNumerationSystemIntValue()));

//        int num;
//        try {
//            num = Integer.parseInt(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue());
//        }catch (Exception e) {
//            throw new NumberFormatException();
//        }
//
//        return new Number(expectedNumerationSystem, Integer.toString(num, expectedNumerationSystem.getNumerationSystemIntValue()));

        BigInteger n;
        try {
            n = new BigInteger(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue());
        }catch (NumberFormatException e) {
            throw  new NumberFormatException();
        }

        return new Number(expectedNumerationSystem, n.toString(expectedNumerationSystem.getNumerationSystemIntValue()));

    }
}
