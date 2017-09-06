package task09.task0912;

/**
 * Created by ukr-sustavov on 07.07.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);

        }catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
