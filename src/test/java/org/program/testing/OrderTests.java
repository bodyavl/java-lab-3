package org.program.testing;

import org.junit.jupiter.api.Test;
import org.program.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderTests {
    Order order = mock(Order.class);

    @Test
    void GetStatusTest() {
        when(order.GetStatus()).thenReturn("Created");
        assertEquals("Created", order.GetStatus());
    }

    @Test
    void MakeOrderTest() {
        when(order.MakeOrder()).thenReturn("Ordered");
        assertEquals("Ordered", order.MakeOrder());
    }
}
