package task28.task2810;

import task28.task2810.model.Provider;

import java.util.Arrays;

/**
 * Created by ukr-sustavov on 22.08.2017.
 */
public class Controller {

    private Provider[] providers;

    public Controller(Provider... providers) {
        if (providers.length == 0) {
            throw new IllegalArgumentException();
        }
        this.providers = providers;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }
}
