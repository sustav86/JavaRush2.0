package task27.task2712.kitchen;

import java.util.Arrays;

/**
 * Created by ukr-sustavov on 19.08.2017.
 */
public enum Dish {
    Fish, Steak, Soup, Juice, Water;

    public static String allDishesToString() {
        return Arrays.toString(Dish.values());
    }

}
