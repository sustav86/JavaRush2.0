package task37.task3709;

import task37.task3709.connectors.Connector;
import task37.task3709.connectors.SimpleConnector;
import task37.task3709.security.SecurityProxyConnector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        System.out.println(list.size());


        Connector securityProxyConnector = new SecurityProxyConnector("google.com");
        Connector simpleConnector = new SimpleConnector("javarush.ru");

        System.out.println("Connecting with SimpleConnector...");
        simpleConnector.connect();

        System.out.println("----------------------------------------------------");

        System.out.println("Connecting with SecurityProxyConnector...");
        securityProxyConnector.connect();
    }
}
