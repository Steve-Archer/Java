package com.steve.OOPIntroStocks_Portfolio;

import java.util.ArrayList;

public class PortfolioStockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello OOP Intro!");
		
		Stock stock1 = new Stock();
		Stock stock2 = new Stock();
		Stock stock3 = new Stock();
		Stock stock4 = new Stock("Tesla", 950.00);	
		
		stock1.setName("MARA");
		stock2.setName("Apple");
		stock3.setName("Novavax");
		
		stock1.setPrice(24.99);
		stock2.setPrice(170.99);
		stock3.setPrice(88.50);

		
		
		System.out.println(stock4.getName());
		System.out.println(String.format("Stock 1 info: Name - %s. Price - %s", stock1.getName(), stock1.getPrice()));
		
		Portfolio portfolio1 = new Portfolio();
		Portfolio portfolio2 = new Portfolio();
		
		
		
		portfolio1.setName("Fritz");
		portfolio1.setTotalBalance(100);
		portfolio1.setDiamondHands(false);
		ArrayList<Stock> fritzStocks = new ArrayList<Stock>();
		fritzStocks.add(stock1);
		fritzStocks.add(stock2);
		portfolio1.setStocks(fritzStocks);
		System.out.println(portfolio1.getStocks());
		portfolio1.addOneStock(stock4);
		System.out.println(portfolio1.getStocks());
		System.out.println(String.format("Portfolio Info: Owner: %s", portfolio1.getName()));
		portfolio1.printRiskAssessment();
		System.out.println(portfolio1.getTotalBalance());
		portfolio1.displayInfo();
		System.out.println(Portfolio.getNumberOfAccountsCreated());
		
	}

}
