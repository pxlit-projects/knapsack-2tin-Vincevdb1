package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Item> items = new ArrayList<Item>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        double sum = 0;
        for (Item item : getItems()) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void add(Item item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() > this.maximumCapacity) {
            throw new KnapsackFullException("item doesn't fit into the knapsack");
        } else {
            getItems().add(item);
        }
    }


    public List<Item> getItems() {
        return items;
    }
}
