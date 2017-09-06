package task37.task3709.security;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class SecurityCheckerImpl implements SecurityChecker {
    @Override
    public boolean performSecurityCheck() {
        System.out.println("SECURITY OK!");
        return true;
    }
}
