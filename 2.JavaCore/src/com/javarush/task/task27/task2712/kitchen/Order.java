package task27.task2712.kitchen;

import task27.task2712.ConsoleHelper;
import task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by ukr-sustavov on 19.08.2017.
 */
public class Order {
    protected List<Dish> dishes;
    protected final Tablet tablet;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(this + " of " + tablet);
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        }

        return "Your order: " + dishes;
    }
}
