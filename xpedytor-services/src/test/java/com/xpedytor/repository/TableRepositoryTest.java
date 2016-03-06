package com.xpedytor.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertNull(tableRepository.findTable(1)); // TODO not implemented yet
    }
}
