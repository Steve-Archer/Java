package com.steve.ordersAndItems;
import java.util.ArrayList;

public class Order {
	private String name;
	private double total;
	private boolean ready;
	private ArrayList<Item> items = new ArrayList<Item>();
	
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
	public void displayOrder() {
		String orderHeader = "<--This is your order-->";
		String order = "";
		for(int i = 0;i<this.items.size();i++) {
			order += this.items.get(i).getName() + " ---> " + this.items.get(i).getPrice() + "\n";
		}
		System.out.println(orderHeader);
		System.out.println(order);
		System.out.println("Your total is " + this.getTotal());
	}
	
}
