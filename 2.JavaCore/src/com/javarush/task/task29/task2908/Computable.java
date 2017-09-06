package task29.task2908;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public interface Computable<Argument, Value> {
    Value compute(Argument argument) throws InterruptedException;
}
