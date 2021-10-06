package com.bank;

public class SwipeShopping extends Deposit {
	
	double charges;
	double balance;
	
	double charges(int amount) {
			charges=(0.01*amount);
			return charges;
	}
	
	double balance(int amount, Account acc) {
		balance=acc.getBalance()-amount+charges;
		return balance;
	}
	
}

