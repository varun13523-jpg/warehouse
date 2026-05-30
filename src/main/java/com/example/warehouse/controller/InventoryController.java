package com.example.warehouse.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Inventory")
public class InventoryController {
	@Autowired
	InvestoryRepository repository;
	
	@GetMapping
	public Collection<InventoryItem> getItems(){
		return repository.findAll();
	}

	useEffect(() => {
		fetch("https://localhost:8080/api/investory")
		.then(res => res.json())
		.then(data => setItems(data));
	},[]);
}
