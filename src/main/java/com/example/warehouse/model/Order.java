package com.example.warehouse.model;

public class Order {
private Long id;
private Long itemId;
private int quality;
private String customerType;
private String status;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getItemId() {
	return itemId;
}
public void setItemId(Long itemId) {
	this.itemId = itemId;
}
public int getQuality() {
	return quality;
}
public void setQuality(int quality) {
	this.quality = quality;
}
public String getCustomerType() {
	return customerType;
}
public void setCustomerType(String customerType) {
	this.customerType = customerType;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
