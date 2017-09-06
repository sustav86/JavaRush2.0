package task35.task3508;

import java.util.List;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public abstract class Solution {
    public abstract <T> void one(List<T> destination, List<T> source);

    public abstract <T> void two(List<T> destination, List<? extends T> source);

    public abstract <T> void three(List<T> destination, List<T> source);

    public abstract <T> void four(List<? super T> destination, List<? super T> source);
}