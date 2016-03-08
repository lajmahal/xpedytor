package com.xpedytor;

import com.xpedytor.model.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;
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
        Response res = resource.getTable(1);

        assertNotNull(res);
        assertEquals(Response.Status.OK.getStatusCode(), res.getStatus());

        Table table = (Table) res.getEntity();
        assertNotNull(table);
        assertEquals(1, table.getNumber());
    }

    @Test
    public void test_getTableNotFound() {
        Response res = resource.getTable(999); // does not exist

        assertNotNull(res);
        assertEquals(Response.Status.NOT_FOUND.getStatusCode(), res.getStatus());
    }

    @Test
    public void test_getTableInvalid() {
        Response res1 = resource.getTable(0);
        Response res2 = resource.getTable(-1);

        assertNotNull(res1);
        assertNotNull(res2);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), res1.getStatus());
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), res2.getStatus());
    }
}
