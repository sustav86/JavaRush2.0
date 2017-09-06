package task36.task3601;

/**
 * Created by ukr-sustavov on 14.08.2017.
 */
public class View {

    public void fireEventShowData() {
        System.out.println(new Service(new Controller(new Model(), new View())).onDataListShow());
    }

}
