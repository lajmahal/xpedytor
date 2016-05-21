package com.xpedytor.repository.impl;

import com.xpedytor.repository.TableRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by chakushy on 7/3/16.
 */
public class TableRepositoryImplTest {
    private TableRepository tableRepository;

    @Before
    public void setUp() {
        tableRepository = new TableRepositoryImpl();
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
        assertEquals(1, tableRepository.findTable(1).getTableNumber());
    }
}
