package task25.task2509;

/**
 * Created by ukr-sustavov on 10.07.2017.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public interface CancellableTask<T> extends Callable<T> {
    void cancel();

    RunnableFuture<T> newTask();
}
