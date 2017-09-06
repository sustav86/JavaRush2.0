package task35.task3510;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Kitten extends Cat {
    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Котенок " + name;
    }
}
