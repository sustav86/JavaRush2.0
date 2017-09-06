package com.javarush.task.task1.javastringimmutability;

/**
 * Created by SUSTAVOV on 08.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        String main = "abcd";
        String s = main; //the same reference
        main = main.concat("ef"); //another reference, in the heap we found "abcd" Object
    }
}
