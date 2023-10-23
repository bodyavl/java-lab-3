package org.program;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {

    public static int getNumberInputInRange(Scanner in, int range) {
        String message = String.format("The value was not valid, please, enter number in range (0-%s): ", range);
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                int val = Integer.parseInt(in.nextLine());
                if (val >= 1 && val <= range) {
                    return val;
                }
                else {
                    System.out.println(message);
                }
            } else {
                System.out.println(message);
                in.nextLine();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Cart cart = new Cart();
        Order order = new Order(1);
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Product[] products = {  new Product(1, "Apple", 100),
                                new Product(2, "Carrot", 200),
                                new Product(3, "Milk", 300),
                                new Product(4, "Bread", 400),
                                new Product(5, "Eggs", 500) };
        while(true) {
            System.out.println("Select action:");
            System.out.println("1. Add product to cart");
            System.out.println("2. Remove product from cart");
            System.out.println("3. Show cart");
            System.out.println("4. Make order");
            System.out.println("5. Check order status");
            System.out.println("6. Exit");
            int action = getNumberInputInRange(scanner, 6);
            switch (action) {
                case 1 -> {
                    if(order.GetStatus().equals("Created")) {
                        System.out.println("Order already created");
                        break;
                    }
                    System.out.println("Select product:");
                    for (Product product : products) {
                        System.out.println(product.Id + ". " + product.Name + " - " + product.Price);
                    }
                    int productIndex = getNumberInputInRange(scanner, products.length);
                    cart.AddProduct(products[productIndex - 1]);
                    System.out.println("Product added to cart");
                }
                case 2 -> {
                    if(order.GetStatus().equals("Created")) {
                        System.out.println("Order already created");
                        break;
                    }
                    System.out.println("Select product:");
                    int i = 1;
                    for (Product product : cart.GetProducts()) {
                        System.out.println(i++ + ". " + product.Name + " - " + product.Price);
                    }
                    int productIndex = getNumberInputInRange(scanner, cart.GetProducts().size());
                    cart.RemoveProduct(cart.GetProducts().get(productIndex - 1));
                    System.out.println("Product removed from cart");
                }
                case 3 -> {
                    if(order.GetStatus().equals("Created")) {
                        System.out.println("Order already created");

                        break;
                    }
                    System.out.println("Cart:");
                    int i = 1;
                    for (Product product : cart.GetProducts()) {
                        System.out.println(i++ + ". " + product.Name + " - " + product.Price);
                    }
                }
                case 4 -> {
                    if(order.GetStatus().equals("Created")) {
                        System.out.println("Order already created");
                        break;
                    }
                    order.Products = cart.GetProducts();
                    order.MakeOrder();
                    System.out.println("Order status: " + order.GetStatus());
                }
                case 5 -> System.out.println("Order status: " + order.GetStatus());
                case 6 -> isRunning = false;
            }
            if (!isRunning) break;
        }

    }

}

