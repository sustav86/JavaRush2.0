package task35.task3512;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Event {
    private static int nextId = 1;

    private int id;

    public Event() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }
}
