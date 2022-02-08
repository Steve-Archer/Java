package com.steve.BankAccount;

public class BankAccount {
	private double checking;
	private double savings;
	
	public static int numberOfAccounts = 0;
	public static double totalOfAllAccounts = 0;
	
	public BankAccount(double checking, double savings) {
		this.checking = checking;
		this.savings = savings;
		numberOfAccounts++;
		totalOfAllAccounts+=this.checking;
		totalOfAllAccounts+=this.savings;
	}

	public double getChecking() {
		return checking;
	}

	public double getSavings() {
		return savings;
	}
	public void checkingDeposit(double amount) {
		this.checking+=amount;
		totalOfAllAccounts+=amount;
	}
	public void savingsDeposit(double amount) {
		this.savings+=amount;
		totalOfAllAccounts+=amount;
	}
	public void checkingWithdrawal(double amount) {
		if(this.checking>=amount){
		this.checking-=amount;
		totalOfAllAccounts-=amount;
		}
	}
	public void savingsWithdrawal(double amount) {
		if(this.savings>=amount){
		this.savings-=amount;
		totalOfAllAccounts-=amount;
		}
	}
	public double totalInAccount() {
		double total = this.checking + this.savings;
		return total;
	}
	
	
	
	
	
}
