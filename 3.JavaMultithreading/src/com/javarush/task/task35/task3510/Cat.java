package task35.task3510;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}
