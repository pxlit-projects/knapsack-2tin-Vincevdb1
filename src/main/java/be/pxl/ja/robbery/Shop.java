package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Inventory;
import be.pxl.ja.knapsack.Item;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Inventory {

    List<Item> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }


}
