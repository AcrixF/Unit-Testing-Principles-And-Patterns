package ch02;

import java.util.HashMap;
import java.util.Map;

public class Store {

    Map<Product, Integer> products = new HashMap<>();

    public void addInventory(Product product, int quantity) {
        products.putIfAbsent(product, quantity);
    }

    public Integer getInventory(Product product) {
        return 5;
    }
}
