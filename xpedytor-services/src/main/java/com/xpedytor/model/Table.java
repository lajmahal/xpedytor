package com.xpedytor.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by laj on 3/3/16.
 */
@XmlRootElement
public class Table {
    private int tableNumber;
    private int seats;
    private boolean occupied;
    private int adultCustomers;
    private int childrenCustomers;
    private List<Order> orders;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getAdultCustomers() {
        return adultCustomers;
    }

    public void setAdultCustomers(int adultCustomers) {
        this.adultCustomers = adultCustomers;
    }

    public int getChildrenCustomers() {
        return childrenCustomers;
    }

    public void setChildrenCustomers(int childrenCustomers) {
        this.childrenCustomers = childrenCustomers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
