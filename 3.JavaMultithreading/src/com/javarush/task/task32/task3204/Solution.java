package task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 27.06.2017.
 */
public class Solution {
    public static int PASS_LENGTH = 8;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            ByteArrayOutputStream password = getPassword();
            System.out.println(password.toString());
        }
    }

    public static ByteArrayOutputStream getPassword() {
        List<Integer> password = new ArrayList<>(PASS_LENGTH);
        while (!checkPassword(password)) {
            getPass(password);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1);

        for (int i = 0; i < password.size(); i++) {
            byteArrayOutputStream.write(password.get(i));
        }
//
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//        byteArrayOutputStream.write((byte)((char)(48+(int) (Math.random()*10))));
//
//        System.out.println(((48+(int) (Math.random()*10))));
//        System.out.println(byteArrayOutputStream);

        return byteArrayOutputStream;
    }

    public static boolean checkPassword(List<Integer> password) {
        return password.stream().anyMatch(p -> p >= 48 && p <= 57) && password.stream().anyMatch(p -> p >= 65 && p <= 90) && password.stream().anyMatch(p -> p >= 97 && p <= 122);
    }

    public static List<Integer> getPass(List<Integer> password) {
        double random;
        password.clear();
        for (int i = 0; i < PASS_LENGTH; i++) {
            random = Math.random() * 10;
            if (random < 3) {
                password.add(i, 48+(int) (Math.random()*10));
            }else if (random >= 3 && random < 6) {
                password.add(i, 65+(int) (Math.random()*26));
            }else {
                password.add(i, 97+(int) (Math.random()*26));
            }
        }

        return password;
    }
}
