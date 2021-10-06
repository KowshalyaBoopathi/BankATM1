package com.bank;

import java.util.*;

public abstract class Deposit {
	
	double balance;
	
	abstract double charges(int amount);
	
	abstract double balance(int amount, Account account);
	
	double deposit(int amount, Account acc) {
		balance=amount+acc.getBalance();
		acc.setBalance(balance);
		  return balance;
	}
	
	double balanceCheck(Account acc) {
			return acc.getBalance();
		  }
	
	Account isValidAccount(int number) {
		Iterator<Account> itr = AccountDetails.list.iterator();  
		  while(itr.hasNext()){  
		    Account acc=(Account)itr.next();
		    if(number==acc.getNumber())
		    	return acc;
	}
		return null;
	}
	
	Account isValidCard(int cardNumber) {
		Iterator<Account> itr = AccountDetails.list.iterator();  
		  while(itr.hasNext()){  
		    Account acc=(Account)itr.next();
		    if(cardNumber==acc.getCardNumber())
		    	return acc;
	}
		return null;
	}
	
	
	boolean isValidTransaction(double balance, Account acc) {
		if(balance >= acc.getMINIMUM_BALANCE()) {
			acc.setBalance(balance);
				return true;
			}
		else
			return false;
		}	

}
//can call cash shop
//no ATM card object
//use inherit here
//include override
//is valid transaction should be here as inheritance 
//charges and balance should be abstract and have their own implementation