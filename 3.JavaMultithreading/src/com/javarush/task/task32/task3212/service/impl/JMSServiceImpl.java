package task32.task3212.service.impl;

import task32.task3212.service.Service;

/**
 * Created by ukr-sustavov on 12.07.2017.
 */
public class JMSServiceImpl implements Service {
    @Override
    public String getName() {
        return "JMSService";
    }

    @Override
    public void execute() {
        System.out.println("Executing JMSService");
    }
}
