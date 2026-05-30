package com.example.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.warehouse.model.Order;

public class OrderService {
@Autowired
public String processOrder(Order order) {
	InventoryItem item = repository.findById(order.getItemId(Order order));
		InventoryItem = repository.findById(order.getItemId());
		if(item == null) 
			return "ITEM NOT FOUND";
			
	synchronized (item) {
		if(item.getStockQuality() >= order.getQuality()) {
			item.setStockQuality{
				item.setStockQuality() - order.getQuality());
				order.setStatus("Processed");
			} else {
				order.setStatus("BACKORDERED");
			}
			if(item.getStockQuality()< item.getRestockThresold()) {
				System.out.println("warning : item " + item.getName() + "has");
			};
		}
	}
	return order.getStatus()	;
}
	
}
