package com.xpedytor.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by laj on 3/3/16.
 */
@XmlRootElement
public class Order {
    private Long id;
    private OrderStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
