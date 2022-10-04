package be.pxl.ja.robbery;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, Shop shop) {
        Collections.sort(shop.getItems());

        for (Product product : shop.getItems()) {
            try {
                knapsack.add(product);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
