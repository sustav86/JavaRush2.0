package task28.task2810;

import task28.task2810.model.Provider;
import task28.task2810.model.Strategy;

/**
 * Created by ukr-sustavov on 22.08.2017.
 */
public class Aggregator {
    public static void main(String[] args) {
        Provider provider = new Provider(new Strategy() {});
        Controller controller = new Controller(provider);
        System.out.println(controller);
    }
}
