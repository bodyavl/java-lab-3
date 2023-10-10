package org.program.testing;

import org.junit.jupiter.api.Test;
import org.program.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTests {
    Product product;
    @Test
    public void AddProductTest() {
        // Arrange
        product = new Product(1, "Product", 100);
        assertEquals(1, product.Id);
        assertEquals("Product", product.Name);
        assertEquals(100, product.Price);
    }
}
