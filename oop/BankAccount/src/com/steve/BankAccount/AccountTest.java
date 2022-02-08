package com.steve.BankAccount;

public class AccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(100, 50);
		System.out.println(account1.getChecking());
		System.out.println(account1.getSavings());
		account1.checkingDeposit(75);
		account1.savingsDeposit(200);
		System.out.println(account1.getChecking());
		System.out.println(account1.getSavings());
		account1.checkingWithdrawal(25);
		account1.savingsWithdrawal(475);
		System.out.println(account1.getChecking());
		System.out.println(account1.getSavings());
	}
}

