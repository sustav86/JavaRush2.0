package task05.task0514;

/**
 * Created by ukr-sustavov on 04.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vas", 20);
    }

    static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
