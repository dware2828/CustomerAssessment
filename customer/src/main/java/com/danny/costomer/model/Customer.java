package com.danny.costomer.model;



import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Customer")
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@MongoId
	@Field(name = "CUST_ID")
	private int customerId;
	@Indexed(unique = true)
	@Field(name = "ORDER_NUM")
	private String orderNumber;
	@Field(name = "ORDER_ITEMS")
	private List<OrderItems> orderItems;
	@Version
	private Long version;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	
	
	
}
