package task29.task2908;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public class Square implements Computable<Integer, Integer> {
    @Override
    public Integer compute(Integer integer) throws InterruptedException {
        int val = integer.intValue();
        return val * val;
    }
}
