package task32.task3208;

import java.rmi.RemoteException;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void say() throws RemoteException {
        System.out.println("meow");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Cat " + name + " ");
    }
}
