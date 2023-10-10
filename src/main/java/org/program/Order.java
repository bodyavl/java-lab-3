package org.program;

import java.util.ArrayList;

public class Order {
    public int OrderId;
    private String status;
    public ArrayList<Product> Products;
    public Order(int orderId, ArrayList<Product> products) {
        OrderId = orderId;
        Products = products;
        status = "Created";
    }
    
    public String GetStatus() {
        return status;
    }

    public String MakeOrder() {
        status = "Ordered";
        return status;
    }
}
