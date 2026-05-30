package com.example.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.warehouse.model.InventoryItem;
import com.example.warehouse.model.Order;
import com.example.warehouse.repository.InventoryRepository;

@Service
public class OrderService {

    @Autowired
    private InventoryRepository repository;

    public String processOrder(Order order) {

        InventoryItem item =
                repository.findById(order.getItemId());

        if (item == null) {
            order.setStatus("ITEM_NOT_FOUND");
            return order.getStatus();
        }

        synchronized (item) {

            if (item.getStockQuantity() >= order.getQuantity()) {

                item.setStockQuantity(
                        item.getStockQuantity()
                                - order.getQuantity());

                order.setStatus("PROCESSED");

            } else {

                order.setStatus("BACKORDERED");
            }

            if (item.getStockQuantity()
                    < item.getRestockThreshold()) {

                System.out.println(
                        "Warning: Item "
                                + item.getName()
                                + " has fallen below threshold!");
            }
        }

        return order.getStatus();
    }
}