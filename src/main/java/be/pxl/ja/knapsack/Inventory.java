package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Inventory<I extends Item> {
    List<I> items = new ArrayList<>();
    public void add(I item) {items.add(item);}
    public List<I> getItems() { return items;}
}
