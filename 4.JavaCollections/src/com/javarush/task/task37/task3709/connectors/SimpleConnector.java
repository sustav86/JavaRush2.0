package task37.task3709.connectors;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class SimpleConnector implements Connector {
    private String resourceString;

    public SimpleConnector(String resourceString) {
        this.resourceString = resourceString;
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected to " + resourceString);
    }
}
