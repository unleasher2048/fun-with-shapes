package com.caleb.example.funwithshapes.service;

import com.caleb.example.funwithshapes.domain.order.Order;
import com.caleb.example.funwithshapes.domain.order.OrderConfirmation;

public interface OrderRepository {
    OrderConfirmation order(Order order);
}
