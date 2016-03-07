package com.xpedytor;

import com.xpedytor.model.Order;
import com.xpedytor.repository.IOrderRepository;
import com.xpedytor.repository.OrderRepositoryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by chakushy on 3/7/16.
 */
@Path("orders")
public class OrderResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderResource.class);

    private IOrderRepository orderRepository = OrderRepositoryFactory.get();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getAllOrders() {
        LOGGER.info("Getting all orders...");

        return orderRepository.findAllOrders();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{orderId}")
    public Order getOrder(@PathParam("orderId") Long orderId) {
        LOGGER.info(String.format("Getting order ID [%d]", orderId));

        return orderRepository.findOrder(orderId);
    }
}
