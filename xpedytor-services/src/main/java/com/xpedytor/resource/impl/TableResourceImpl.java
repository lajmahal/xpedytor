package com.xpedytor.resource.impl;

import com.xpedytor.model.Table;
import com.xpedytor.repository.TableRepository;
import com.xpedytor.repository.TableRepositoryFactory;
import com.xpedytor.resource.TableResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by laj on 3/3/16.
 */
@Path("tables")
public class TableResourceImpl implements TableResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(TableResourceImpl.class);

    private TableRepository tableRepository = TableRepositoryFactory.get();

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllTables() {
        LOGGER.info("Getting all tables...");

        List<Table> tables = tableRepository.findAllTables();

        if (tables == null || tables.isEmpty()) {
            LOGGER.error("No tables found!");
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        GenericEntity<List<Table>> entity = new GenericEntity<List<Table>>(tables) {
        };

        return Response.ok().entity(entity).build();
    }

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{tableNumber}")
    public Response getTable(@PathParam("tableNumber") int tableNumber) {
        LOGGER.info(String.format("Getting table number [%d]", tableNumber));

        if (tableNumber < 1) {
            LOGGER.error(String.format("[%d] is an invalid table number", tableNumber));
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        Table t = tableRepository.findTable(tableNumber);

        if (t == null) {
            LOGGER.error(String.format("Table number [%d] not found", tableNumber));
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(t).build();
    }
}
