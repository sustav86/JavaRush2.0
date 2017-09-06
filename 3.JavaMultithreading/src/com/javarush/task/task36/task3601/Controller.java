package task36.task3601;

import java.util.List;

/**
 * Created by ukr-sustavov on 14.08.2017.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public List<String> getStringDataList() {
        return model.getData();
    }

}
