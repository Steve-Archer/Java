package com.steve.ordersAndItems;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    	Item item1 = new Item("mocha", 3.5);
    	Item item2 = new Item("latte", 4.5);
    	Item item3 = new Item("drip coffee", 5.5);
    	Item item4 = new Item("capuccino", 6.5);
        // Order variables -- order1, order2 etc.
    	Order order1 = new Order();
    	Order order2 = new Order();
    	Order order3 = new Order();ban
    	Order order4 = new Order();
    	order1.setName("Cindhuri");
    	order2.setName("Jimmy");
    	order3.setName("Noah");
    	order4.setName("Sam");
    	System.out.println(order1);
    	System.out.println(order1.getTotal());
    	order2.addItem(item1);
    	order2.displayOrder();
    	order3.addItem(item4);
    	order3.addItem(item4);
    	order3.displayOrder();
    	order4.addItem(item2);
    	order4.displayOrder();
    	order1.setReady(true);
    	System.out.println(order1.isReady());
    	order4.addItem(item2);
    	order4.addItem(item2);
    	order4.displayOrder();
    	order2.setReady(true);
    	System.out.println(order2.isReady());
    	System.out.println(order3.getStatusMessage());
    	System.out.println(order2.getOrderTotal());
      
    }
}