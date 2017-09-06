package task32.task3208;

import java.rmi.RemoteException;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void say() throws RemoteException {
        System.out.println("woof");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Dog " + name + " ");
    }
}