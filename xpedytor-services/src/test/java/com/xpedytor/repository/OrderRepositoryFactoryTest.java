package com.xpedytor.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by chakushy on 3/7/16.
 */
public class OrderRepositoryFactoryTest {

    private OrderRepositoryFactory factory;

    @Before
    public void setUp() {
        factory = new OrderRepositoryFactory();
    }

    @After
    public void tearDown() {
        // nothing here yet
    }

    @Test
    public void test_get() {
        assertNotNull(factory.get());
    }
}
