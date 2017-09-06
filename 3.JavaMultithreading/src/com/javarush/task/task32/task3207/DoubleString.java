package task32.task3207;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ukr-sustavov on 11.07.2017.
 */
public interface DoubleString extends Remote {
    String doubleString(String str) throws RemoteException;
}
