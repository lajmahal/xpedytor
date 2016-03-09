package com.xpedytor.repository;

import com.xpedytor.model.Order;
import com.xpedytor.model.OrderStatus;
import com.xpedytor.model.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderRepository implements IOrderRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderRepository.class);

    private ITableRepository tableRepository = TableRepositoryFactory.get();

    @Override
    public List<Order> findAllOrders() {

        LOGGER.info("Finding all orders");

        List<Table> tables = tableRepository.findAllTables();

        List<Order> orders = new ArrayList<Order>();

        for (Table table: tables) {
            orders.addAll(table.getOrders());
        }

        return orders;
    }

    @Override
    public Order findOrder(Long orderId) {

        LOGGER.info(String.format("Finding order [%d]", orderId));

        // TODO not yet implemented

        Order order = new Order();
        order.setId(1L);
        order.setStatus(OrderStatus.PENDING);

        if (orderId == 1L) {
            return order;
        } else {
            return null;
        }
    }
}
