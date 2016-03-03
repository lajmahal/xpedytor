package com.xpedytor;

import com.xpedytor.model.Table;
import com.xpedytor.repository.ITableRepository;
import com.xpedytor.repository.TableRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by laj on 3/3/16.
 */
@Path("tables")
public class TableResource {
    private ITableRepository tableRepository = new TableRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Table> getAllTables() {
        return tableRepository.findAllTables();
    }
}
