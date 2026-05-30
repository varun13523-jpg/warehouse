package com.example.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.warehouse.model.Order;
import com.example.warehouse.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public String placeOrder(
            @RequestBody Order order) {

        return service.processOrder(order);
    }
}