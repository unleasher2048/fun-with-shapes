package com.caleb.example.funwithshapes.domain.order;

import com.caleb.example.funwithshapes.domain.customer.Customer;
import com.caleb.example.funwithshapes.domain.shape.Shape;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Order {
    private final Customer customer;
    private final LocalDate dateOfOrder;
    private final List<Shape> shapeItems;

    public Order(final Customer customer, final LocalDate dateOfOrder) {
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
        this.shapeItems = new ArrayList<>();
    }

    public void addShapeItem(final Shape shapeItem) {
        shapeItems.add(shapeItem);
    }

    public List<Shape> getShapeItems() {
        return new ArrayList<>(shapeItems);
    }

    public Customer getCustomer() throws CloneNotSupportedException {
        return customer.clone();
    }

    public LocalDate getDateOfOrder() {
        return LocalDate.of(dateOfOrder.getYear(), dateOfOrder.getMonth(), dateOfOrder.getDayOfMonth());
    }
}
