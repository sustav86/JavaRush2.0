package task30.task3004;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by ukr-sustavov on 01.08.2017.
 */
public class BinaryRepresentationTask extends RecursiveTask<String> {
    private int x;

    public BinaryRepresentationTask(int x) {
        this.x = x;
    }

    @Override
    protected String compute() {
        String sum = String.valueOf(x % 2);
        List<BinaryRepresentationTask> subTasks = new LinkedList<>();
        int b = x / 2;

        if (b > 0) {
            BinaryRepresentationTask task = new BinaryRepresentationTask(b);
            task.fork();
            subTasks.add(task);
        }

        for (BinaryRepresentationTask task :
                subTasks) {
            sum  = task.join() + sum;
        }

        return sum;
    }
}
