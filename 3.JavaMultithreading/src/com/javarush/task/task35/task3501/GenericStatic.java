package task35.task3501;

/**
 * Created by ukr-sustavov on 04.08.2017.
 */
public class GenericStatic {
    public static <T> T someStaticMethod(T genericObject) {
        System.out.println(genericObject);

        return genericObject;
    }
}
