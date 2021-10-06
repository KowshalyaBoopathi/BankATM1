package com.bank;

public class CashDispense extends Deposit {

	double charges;
	double balance;
	
	boolean dispenseCash(int amount) {
		if(amount%5==0)
			return true;
		else
			System.out.println("Please correct the amount of value. It should be multiple of USD 5"
					+ "");
		return false;
	}

	@Override
	double charges(int amount) {
		if(amount > 100) {
			charges=(0.04*amount);
			return charges;
		}
		else {
			charges=(0.02*amount);
			return charges;
		}
	}

	@Override
	double balance(int amount,Account acc) {
		balance=acc.getBalance()-amount-charges;
		return balance;
		}

}

//Did not maintain state of the class	
