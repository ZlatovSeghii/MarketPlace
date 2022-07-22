package main;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private final int id;
    private final String name;
    private final int price;

    static List<Products> products = new ArrayList<>();
    static Products products1 = new Products(1, "Pants", 100);
    static Products products2 = new Products(2, "Shoes", 200);
    static Products products3 = new Products(3, "T-shirt", 50);

    static {
        products.add(products1);
        products.add(products2);
        products.add(products3);
    }

    public Products(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void showAllProducts() {
        for (Products product : products) {
            System.out.println(product);
        }
    }
    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product id: " + +id +
                ", product name: " + name +
                ", product price: " + price + ".";
    }
}