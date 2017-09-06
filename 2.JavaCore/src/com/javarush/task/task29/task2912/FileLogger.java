package task29.task2912;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class FileLogger extends AbstractLogger implements Logger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to file: " + message);
    }

}
