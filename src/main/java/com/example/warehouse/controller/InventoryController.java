package com.example.warehouse.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.warehouse.model.InventoryItem;
import com.example.warehouse.repository.InventoryRepository;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryRepository repository;

    @GetMapping
    public Collection<InventoryItem> getItems() {

        return repository.findAll();
    }
}