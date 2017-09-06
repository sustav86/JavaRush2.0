package task32.task3208;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public class Solution {
    public static Registry registry;
    public static final String UNIC_BINDING_NAME_CAT = "cat";
    public static final String UNIC_BINDING_NAME_DOG = "dog";

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                for (String bindingName : registry.list()) {
                    Animal service = (Animal) registry.lookup(bindingName);
                    service.printName();
                    service.say();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }
    });

    //pretend we start rmi server as SERVER_THREAD thread
    public static Thread SERVER_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            Remote stubCat;
            Remote stubDog;
            try {
                registry = LocateRegistry.createRegistry(2099);
                final Cat cat = new Cat("Barsik");
                final Dog dog = new Dog("Odin");
                stubCat = UnicastRemoteObject.exportObject(cat, 0);
                stubDog = UnicastRemoteObject.exportObject(dog, 0);

                registry.bind(UNIC_BINDING_NAME_CAT, stubCat);
                registry.bind(UNIC_BINDING_NAME_DOG, stubDog);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (AlreadyBoundException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
        //start rmi server thread
        SERVER_THREAD.start();
        Thread.sleep(1000);
        //start client
        CLIENT_THREAD.start();
    }
}
