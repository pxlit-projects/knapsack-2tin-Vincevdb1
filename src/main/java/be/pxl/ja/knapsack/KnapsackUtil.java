package be.pxl.ja.knapsack;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public static <T extends Comparable<T> & Item> void fill(Knapsack<T> knapsack, Inventory<T> inventory) {
        List<T> items = inventory.getItems();
        Collections.sort(items);

        for (T item : inventory.getItems()) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
