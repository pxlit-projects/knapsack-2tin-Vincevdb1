package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Item;

public class Product implements Comparable<Product>, Item {
    private double weight;
    private double price;
    private String name;

    public Product() {}

    public Product(String name, double weight, double price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.getPrice(), this.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}