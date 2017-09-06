package task29.task2912;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class PhoneLogger extends AbstractLogger implements Logger {

    public PhoneLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Call to director: " + message);
    }

}
