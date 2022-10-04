package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Product> items = new ArrayList<Product>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        double sum = 0;
        for (Product item : getItems()) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void add(Product product) throws KnapsackFullException {
        if (getCurrentWeight() + product.getWeight() > this.maximumCapacity) {
            throw new KnapsackFullException("item doesn't fit into the knapsack");
        } else {
            getItems().add(product);
        }
    }

    public List<Product> getItems() {
        return items;
    }
}
