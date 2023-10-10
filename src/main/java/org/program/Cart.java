package org.program;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products;

    public Cart(){}
    public Cart(ArrayList<Product> products) {
        this.products = products;
    }

    public Product AddProduct(Product product) {
        products.add(product);
        return product;
    }

    public ArrayList<Product> GetProducts() {
        return products;
    }

    public Product RemoveProduct(Product product) {
        products.remove(product);
        return product;
    }
}
