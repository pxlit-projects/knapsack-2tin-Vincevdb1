package be.pxl.ja.citytrip;

import be.pxl.ja.knapsack.Inventory;
import be.pxl.ja.knapsack.Item;

import java.util.ArrayList;
import java.util.List;

public class LondonAttractions extends Inventory {

    List<Item> items = new ArrayList<>();

    public void add(Attraction item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
