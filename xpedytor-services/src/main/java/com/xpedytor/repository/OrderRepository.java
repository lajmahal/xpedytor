package com.xpedytor.repository;

import com.xpedytor.model.Order;

import java.util.List;

/**
 * Created by chakushy on 3/7/16.
 */
public interface OrderRepository {

    List<Order> findAllOrders();

    Order findOrder(Long orderId);

}
