package com.xpedytor.repository.impl;

import com.xpedytor.model.Order;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderRepositoryTest {

    private OrderRepository orderRepository;

    @Before
    public void setUp() {
        orderRepository = new OrderRepository();
    }

    @Test
    public void test_findAllOrders() {
        List<Order> orders = orderRepository.findAllOrders();
        assertNotNull(orders);
        assertEquals(2, orders.size());
    }

    @Test
    public void test_findOrder() {
        Order order = orderRepository.findOrder(1L);
        assertNotNull(order);
        assertTrue(1L == order.getId());
    }

}
