package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Inventory;
import be.pxl.ja.knapsack.Item;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Inventory<Product> {

    List<Product> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }


}
