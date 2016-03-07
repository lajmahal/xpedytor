package com.xpedytor;

import com.xpedytor.model.Table;
import com.xpedytor.repository.ITableRepository;
import com.xpedytor.repository.TableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by laj on 3/3/16.
 */
@Path("tables")
public class TableResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(TableResource.class);

    private ITableRepository tableRepository = new TableRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Table> getAllTables() {
        LOGGER.info("Getting all tables...");

        return tableRepository.findAllTables();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{tableNumber}")
    public Table getTable(@PathParam("tableNumber") int tableNumber) {
        LOGGER.info(String.format("Getting table number [%d]", tableNumber));

        return tableRepository.findTable(tableNumber);
    }
}
