package task32.task3208;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public interface Animal extends Remote {
    void say() throws RemoteException;

    void printName() throws RemoteException;
}
