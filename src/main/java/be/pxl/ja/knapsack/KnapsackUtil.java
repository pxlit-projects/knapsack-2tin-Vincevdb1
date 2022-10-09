package be.pxl.ja.knapsack;

import java.util.Collections;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, Inventory inventory) {
        Collections.sort(inventory.getItems());

        for (Item product : inventory.getItems()) {
            try {
                knapsack.add(product);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
