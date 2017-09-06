package task32.task3212;

import task32.task3212.contex.InitialContext;
import task32.task3212.service.Service;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    /**
     * First check the service object available in cache
     * If service object not available in cache do the lookup using
     * JNDI initial context and get the service object. Add it to
     * the cache for future use.
     *
     * @param jndiName The name of service object in context
     * @return Object mapped to name in context
     */
    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service == null) {
            InitialContext initialContext = new InitialContext();
            service = (Service) initialContext.lookup(jndiName);
            cache.addService(service);
        }
        return service;
    }
}
