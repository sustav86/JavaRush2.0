package task36.task3601;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 14.08.2017.
 */
public class Model {
    private List<String> data = new ArrayList<String>() {{
        add("First string");
        add("Second string");
        add("Third string");
    }};

    public List<String> getData() {
        return data;
    }
}
