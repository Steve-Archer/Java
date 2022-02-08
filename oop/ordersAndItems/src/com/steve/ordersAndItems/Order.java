package com.steve.ordersAndItems;
import java.util.ArrayList;

public class Order {
	private String name;
	private double total;
	private boolean ready;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public Order() {
		this.name = "Guest";
	}
	public Order(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public void addItem(Item itemObj) {
		this.items.add(itemObj);
		this.total += itemObj.getPrice();
	}
	public String getStatusMessage() {
		String ready;
		if(this.isReady()) {
			ready = "Your Order is ready";
		}
		else {
			ready = "Thank you for waiting. Your order will be ready soon.";
		}
		return ready;
	}
	public double getOrderTotal() {
		double total = 0;
		for(int i = 0;i<this.items.size();i++) {
			total += this.items.get(i).getPrice();
		}
		return total;
	}
	public void displayOrder() {
		String orderHeader = "<--This is your order-->";
		String order = "";
		for(int i = 0;i<this.items.size();i++) {
			order += this.items.get(i).getName() + " -- $" + this.items.get(i).getPrice() + "\n";
		}
		System.out.println(orderHeader);
		System.out.println("Customer name: " + this.getName());
		System.out.println(order);
		System.out.println("Total: $" + this.getTotal());
	}
	
}
