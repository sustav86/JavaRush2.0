package task25.task2508;

/**
 * Created by ukr-sustavov on 27.07.2017.
 */
public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread thread;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        }

    @Override
    public void start(String threadName) {
        thread = new Thread(this,threadName);
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
