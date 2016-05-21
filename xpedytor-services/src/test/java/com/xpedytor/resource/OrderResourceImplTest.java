package com.xpedytor.resource;

import com.xpedytor.model.Order;
import com.xpedytor.resource.impl.OrderResourceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.core.Response;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderResourceImplTest {

    private OrderResource resource;

    @Before
    public void setUp() {
        resource = new OrderResourceImpl();
    }

    @After
    public void tearDown() {
        // nothing here yet
    }

    @Test
    public void test_getAllOrders() {
        Response res = resource.getAllOrders();

        assertNotNull(res);
        assertEquals(Response.Status.OK.getStatusCode(), res.getStatus());

        List<Order> orders = (List<Order>) res.getEntity();
        assertNotNull(orders);
        assertEquals(2, orders.size());
    }

    @Test
    @Ignore
    public void test_getAllOrdersNotFound() {
        // TODO not yet implemented
    }

    @Test
    public void test_getOrder() {
        Response res = resource.getOrder(1L);

        assertNotNull(res);
        assertEquals(Response.Status.OK.getStatusCode(), res.getStatus());

        Order order = (Order) res.getEntity();
        assertNotNull(order);
        assertTrue(1L == order.getId());
    }

    @Test
    public void test_getOrderBadRequest() {
        Response res1 = resource.getOrder(0L);

        assertNotNull(res1);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), res1.getStatus());

        Response res2 = resource.getOrder(-1L);

        assertNotNull(res2);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), res2.getStatus());
    }

    @Test
    public void test_getOrderNotFound() {
        Response res = resource.getOrder(999L); // does not exist

        assertNotNull(res);
        assertEquals(Response.Status.NOT_FOUND.getStatusCode(), res.getStatus());
    }
}
