package com.steve.ordersAndItems;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    	Item item1 = new Item();
    	Item item2 = new Item();
    	Item item3 = new Item();
    	Item item4 = new Item();
    	item1.setName("mocha");
    	item1.setPrice(3.50);
    	item2.setName("latte");
    	item2.setPrice(4.50);
    	item3.setName("drip coffee");
    	item3.setPrice(5.50);
    	item4.setName("capuccino");
    	item4.setPrice(6.50);
        // Order variables -- order1, order2 etc.
    	Order order1 = new Order();
    	Order order2 = new Order();
    	Order order3 = new Order();
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
    	
      
    }
}