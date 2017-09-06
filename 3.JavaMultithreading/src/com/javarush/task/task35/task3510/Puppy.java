package task35.task3510;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Щенок " + name;
    }
}
