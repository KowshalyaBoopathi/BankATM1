package com.bank;

public class CashDispense extends Validation {
	
	boolean isValidAmount(int amount) {
		if(amount%5==0)
			return true;
		else
			return false;
	}

	@Override
	double charges(int amount) {
		if(amount > 100) 
			return (0.04*amount);
			
		else 
			return (0.02*amount);
	}

	@Override
	double balance(int amount, double charges, Account acc) {
		balance=acc.getBalance()-amount-charges;
		return balance;
		}

}

//Did not maintain state of the class	
