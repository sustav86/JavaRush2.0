package task28.task2808;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ukr-sustavov on 28.07.2017.
 */
public class Zombie extends Character {
    private final static AtomicInteger idSequence = new AtomicInteger();
    private final int id = idSequence.incrementAndGet();

    protected int getId() {
        return id;
    }
}
