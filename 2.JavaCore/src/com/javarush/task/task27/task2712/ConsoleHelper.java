package task27.task2712;

import task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukr-sustavov on 21.08.2017.
 */
public class ConsoleHelper {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishList = new ArrayList<>();
        writeMessage(Dish.allDishesToString());
        writeMessage("Закажите блюдо");
        String stringOrder;
        Dish dish;
        while (!(stringOrder = readString()).equals("exit")) {
            try {
                dish = Dish.valueOf(stringOrder);
                dishList.add(dish);
            }catch (Exception e) {
                writeMessage("Такого блюда нет! Попробуйте еще");
            }
        }

        return dishList;

    }
}
