package com.example.warehouse.model;

public class InventoryItem {

    private Long id;
    private String name;
    private int stockQuantity;
    private int restockThreshold;

    public InventoryItem(Long id, String name,
                         int stockQuantity,
                         int restockThreshold) {

        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.restockThreshold = restockThreshold;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getRestockThreshold() {
        return restockThreshold;
    }
}