package com.xpedytor.resource.impl;

import com.xpedytor.model.Order;
import com.xpedytor.repository.OrderRepository;
import com.xpedytor.repository.OrderRepositoryFactory;
import com.xpedytor.resource.OrderResource;
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
 * Created by chakushy on 3/7/16.
 */
@Path("orders")
public class OrderResourceImpl implements OrderResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderResourceImpl.class);

    private OrderRepository orderRepository = OrderRepositoryFactory.get();

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllOrders() {
        LOGGER.info("Getting all orders...");

        List<Order> orders = orderRepository.findAllOrders();

        if (orders == null || orders.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        GenericEntity<List<Order>> entity = new GenericEntity<List<Order>>(orders) {
        };

        return Response.ok().entity(entity).build();
    }

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{orderId}")
    public Response getOrder(@PathParam("orderId") Long orderId) {
        LOGGER.info(String.format("Getting order ID [%d]", orderId));

        if (orderId <= 0) {
            LOGGER.error(String.format("Order ID of [%d] is invalid", orderId));
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        Order order = orderRepository.findOrder(orderId);

        if (order == null) {
            LOGGER.error(String.format("Order ID [%d] not found", orderId));
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(order).build();
    }
}
