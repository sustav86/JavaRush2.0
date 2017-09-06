package task37.task3709.security;

import task37.task3709.connectors.Connector;
import task37.task3709.connectors.SimpleConnector;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class SecurityProxyConnector implements Connector{
    private SimpleConnector simpleConnector = null;
    private SecurityChecker securityChecker = null;

    public SecurityProxyConnector(String address) {
        simpleConnector = new SimpleConnector(address);
    }

    @Override
    public void connect() {
       if (securityChecker == null) {
           securityChecker = new SecurityCheckerImpl();
       }
        if (securityChecker.performSecurityCheck()) {
            simpleConnector.connect();
        }
    }
}
