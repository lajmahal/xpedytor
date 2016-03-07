package com.xpedytor;

import com.xpedytor.model.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by chakushy on 3/7/16.
 */
public class TableResourceTest {

    private TableResource resource;

    @Before
    public void setUp() {
        resource = new TableResource();
    }

    @After
    public void tearDown() {
        // nothing here yet
    }

    @Test
    public void test_getAllTables() {
        List<Table> tables = resource.getAllTables();
        assertNotNull(tables);
        assertEquals(2, tables.size());
    }

    @Test
    public void test_getTable() {
        Table table = resource.getTable(1);
        assertNotNull(table);
        assertEquals(1, table.getNumber());
    }
}
