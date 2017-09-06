package task29.task2912;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public abstract class AbstractLogger implements Logger {
    protected int level;
    protected Logger next;

    @Override
    public void inform(String message, int level) {
        if (this.level <= level) {
            info(message);
        }
        if (next != null) {
            next.inform(message, level);
        }
    }

    @Override
    public void setNext(Logger next) {
        this.next = next;
    }
}
