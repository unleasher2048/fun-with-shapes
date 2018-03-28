package com.caleb.example.funwithshapes.domain.order;

public class OrderConfirmation {
    private final Order order;
    private final OrderStatus orderStatus;
    private final String additionalInfo;

    public OrderConfirmation(final Order order, final OrderStatus orderStatus, final String additionalInfo) {
        this.order = order;
        this.orderStatus = orderStatus;
        this.additionalInfo = additionalInfo;
    }

    public Order getOrder() {
        return order;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
