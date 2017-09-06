package task32.task3207;

import java.rmi.RemoteException;

/**
 * Created by ukr-sustavov on 11.07.2017.
 */
public class DoubleStringImpl implements DoubleString {
    @Override
    public String doubleString(String str) throws RemoteException {
        return str + str;
    }
}
