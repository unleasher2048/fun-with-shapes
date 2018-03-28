package com.caleb.example.funwithshapes.domain.customer;

import com.caleb.example.funwithshapes.domain.common.Prototype;

public final class Customer extends Prototype<Customer> {
    private final String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
