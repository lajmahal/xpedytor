package com.xpedytor.repository;

import com.xpedytor.model.Order;
import com.xpedytor.model.OrderStatus;
import com.xpedytor.model.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laj on 3/3/16.
 */
public class TableRepository implements ITableRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(TableRepository.class);

    @Override
    public List<Table> findAllTables() {
        LOGGER.info("Finding all tables");

        List<Table> tables = new ArrayList<Table>();

        Table table1 = new Table();
        table1.setNumber(1);
        table1.setSeats(4);
        table1.setAdultCustomers(2);
        table1.setChildrenCustomers(2);
        table1.setOccupied(true);

        List<Order> orders1 = new ArrayList<Order>();
        Order order1 = new Order();
        order1.setId(1L);
        order1.setStatus(OrderStatus.PENDING);
        orders1.add(order1);
        table1.setOrders(orders1);
        tables.add(table1);

        Table table2 = new Table();
        table2.setNumber(2);
        table2.setSeats(2);
        table2.setAdultCustomers(2);
        table2.setChildrenCustomers(0);
        table2.setOccupied(true);

        List<Order> orders2 = new ArrayList<Order>();
        Order order2 = new Order();
        order2.setId(2L);
        order2.setStatus(OrderStatus.FULFILLED);
        orders2.add(order2);
        table2.setOrders(orders2);
        tables.add(table2);

        return tables;
    }

    @Override
    public Table findTable(int tableNumber) {
        LOGGER.info(String.format("Finding table number [%d]", tableNumber));

        Table table1 = new Table();
        table1.setNumber(1);
        table1.setSeats(4);
        table1.setAdultCustomers(0);
        table1.setChildrenCustomers(0);
        table1.setOccupied(false);

        if (tableNumber == 1) {
            return table1;
        }
        else {
            return null;
        }
    }
}
