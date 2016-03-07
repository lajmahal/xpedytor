package com.xpedytor;

import com.xpedytor.model.Order;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderResourceTest {

    private OrderResource resource;

    @Before
    public void setUp() {
        resource = new OrderResource();
    }

    @After
    public void tearDown() {
        // nothing here yet
    }

    @Test
    public void test_getAllOrders() {
        List<Order> orders = resource.getAllOrders();
        assertNotNull(orders);
        assertEquals(2, orders.size());
    }

    @Test
    public void test_getOrder() {
        Order order = resource.getOrder(1L);
        assertNotNull(order);
        assertTrue(1L == order.getId());
    }
}
