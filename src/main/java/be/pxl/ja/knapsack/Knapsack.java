package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;
public class Knapsack<I extends Item> {
    private double maximumCapacity;
    private List<I> items = new ArrayList<I>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        double sum = 0;
        for (I item : getItems()) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void add(I item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() > this.maximumCapacity) {
            throw new KnapsackFullException("item doesn't fit into the knapsack");
        } else {
            getItems().add(item);
        }
    }
    public List<I> getItems() {
        return items;
    }
}
