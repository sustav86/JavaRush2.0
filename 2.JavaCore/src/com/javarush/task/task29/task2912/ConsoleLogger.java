package task29.task2912;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class ConsoleLogger extends AbstractLogger implements Logger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to console: " + message);
    }
}
