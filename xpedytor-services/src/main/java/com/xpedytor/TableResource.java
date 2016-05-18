package com.xpedytor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by chakushy on 5/18/16.
 */
public interface TableResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response getAllTables();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{tableNumber}")
    Response getTable(@PathParam("tableNumber") int tableNumber);
}
