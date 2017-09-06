package task35.task3512;

/**
 * Created by ukr-sustavov on 08.08.2017.
 */
public class Generator<T> {
    private Class<T> tClass;

    public Generator(Class<T> tClass) {
        this.tClass = tClass;
    }

    T newInstance() throws IllegalAccessException, InstantiationException {
        return tClass.newInstance();
    }
}
