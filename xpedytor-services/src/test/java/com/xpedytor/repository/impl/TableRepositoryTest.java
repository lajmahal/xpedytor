package com.xpedytor.repository.impl;

import com.xpedytor.repository.ITableRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by chakushy on 7/3/16.
 */
public class TableRepositoryTest {
    private ITableRepository tableRepository;

    @Before
    public void setUp() {
        tableRepository = new TableRepository();
    }

    @After
    public void tearDown() {
        // nothing here yet
    }

    @Test
    public void test_findAllTables() {
        assertNotNull(tableRepository.findAllTables());
    }

    @Test
    public void test_findTable() {
        assertEquals(1, tableRepository.findTable(1).getNumber());
    }
}
