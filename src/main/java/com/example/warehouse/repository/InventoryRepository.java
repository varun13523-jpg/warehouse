package com.example.warehouse.repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.example.warehouse.model.InventoryItem;

import jakarta.annotation.PostConstruct;

@Repository
public class InventoryRepository {

    private ConcurrentHashMap<Long, InventoryItem> inventory =
            new ConcurrentHashMap<>();

    @PostConstruct
    public void loadData() {

        inventory.put(1L,
                new InventoryItem(1L, "Laptop", 50, 10));

        inventory.put(2L,
                new InventoryItem(2L, "Mouse", 100, 20));

        inventory.put(3L,
                new InventoryItem(3L, "Keyboard", 75, 15));
    }

    public InventoryItem findById(Long id) {
        return inventory.get(id);
    }

    public Collection<InventoryItem> findAll() {
        return inventory.values();
    }
}