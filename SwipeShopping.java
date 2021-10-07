package com.bank;

public class SwipeShopping extends Validation {
	
	double charges(int amount) {
		return (0.01*amount);
	}
	
	double balance(int amount, double charges, Account acc) {
		balance=acc.getBalance()-amount+charges;
		return balance;
	}
	
}

