package com.danny.costomer.model;
import org.springframework.data.mongodb.core.mapping.Field;

public class OrderItems {
	
	@Field(name = "ITEM_ID")
	private int itemId;
	@Field(name = "Quantity")
	private int quantity;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
