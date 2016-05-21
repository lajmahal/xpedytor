package com.xpedytor.repository;

import com.xpedytor.repository.impl.OrderRepositoryImpl;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderRepositoryFactory {

    public static OrderRepository get() {
        return new OrderRepositoryImpl();
    }

}
