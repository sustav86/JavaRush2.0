package task09.task0906;

/**
 * Created by ukr-sustavov on 07.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            if (element.getMethodName().equals("main")) {
//                System.out.println(element.getClassName() + ": " + element.getMethodName() + ": " + s);
//                return;
//            }
//
//        }

        System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + s);

    }
}
