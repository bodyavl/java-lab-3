package org.program.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.program.Cart;
import org.program.Product;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CartTests {
    static final Cart mockCart = mock(Cart.class);

    @Test
    void AddProductTest() {
        Product product = new Product(1, "Product", 100);
        when(mockCart.AddProduct(any(Product.class))).thenReturn(product);

        assertEquals(product, product);
    }

    @Test
    void GetProductsTest() {
        when(mockCart.GetProducts()).thenReturn(new ArrayList<Product>());

        assertTrue(mockCart.GetProducts() instanceof ArrayList<Product>);
    }

    @Test
    void RemoveProductTest() {


        Product product = new Product(1, "Product", 100);
        when(mockCart.RemoveProduct(any(Product.class))).thenReturn(product);
        Product removed = mockCart.RemoveProduct(product);

        assertEquals(product, removed);
    }
}
