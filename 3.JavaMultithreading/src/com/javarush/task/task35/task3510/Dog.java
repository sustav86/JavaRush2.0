package task35.task3510;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пес " + name;
    }
}
