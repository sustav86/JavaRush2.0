package task36.task3601;

import java.util.List;

/**
 * Created by ukr-sustavov on 14.08.2017.
 */
public class Service {
    private Controller controller;

    public List<String> onDataListShow() {
        return controller.getStringDataList();
    }

    public Service(Controller controller) {
        this.controller = controller;
    }
}
