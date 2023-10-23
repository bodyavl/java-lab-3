package org.program;

import java.util.ArrayList;

public class Order {
    public int OrderId;
    private String status;
    public ArrayList<Product> Products;
    public Order(int orderId, ArrayList<Product> products) {
        OrderId = orderId;
        Products = products;
        status = "Not Created";
    }
    public Order(int orderId) {
        OrderId = orderId;
        status = "Not Created";
    }
    
    public String GetStatus() {
        return status;
    }

    public String MakeOrder() {
        status = "Created";
        return status;
    }
}
