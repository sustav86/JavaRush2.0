package task29.task2909.human;

/**
 * Created by ukr-sustavov on 27.07.2017.
 */
public class Professor extends Teacher {
    Professor(String name, int age, int numberOfStudents) {
        super(name, age, numberOfStudents);
    }

    public void live() {
        teach();
    }
}
