package task32.task3212.contex;

import task32.task3212.service.impl.EJBServiceImpl;
import task32.task3212.service.impl.JMSServiceImpl;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public class InitialContext {
    public Object lookup(String jndiName) {

        if (jndiName.equalsIgnoreCase("EJBService")) {
            System.out.println("Looking up and creating a new EJBService object");
            return new EJBServiceImpl();
        } else if (jndiName.equalsIgnoreCase("JMSService")) {
            System.out.println("Looking up and creating a new JMSService object");
            return new JMSServiceImpl();
        }
        return null;
    }
}
