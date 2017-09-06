package task29.task2912;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public interface Logger {
    void inform(String message, int level);

    void setNext(Logger next);

    void info(String message);
}
