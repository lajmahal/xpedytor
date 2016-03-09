package com.xpedytor.repository;

import com.xpedytor.repository.impl.OrderRepository;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderRepositoryFactory {

    public static IOrderRepository get() {
        return new OrderRepository();
    }

}
