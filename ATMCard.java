package com.bank;

import java.util.*;

public class ATMCard {
	
	public static void main(String[] args) {
		
		int number, amount;
		double charges, balance;
		
		Validation acc = new CashDispense();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number");
		number = sc.nextInt();
		
		Account account = acc.isValidAccount(number);
		
		if(account != null) {
				
		while(true) {
		
		System.out.println("Please select an option");
		System.out.println("1 -> Deposit");
		System.out.println("2 -> Balance");
		System.out.println("3 -> Cash Withdrawal");
		System.out.println("4 -> Swipe");
		System.out.println("5 -> Logout");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
				System.out.println("Enter the amount to be deposited");
				amount = sc.nextInt();
				balance = acc.deposit(amount,account);
				System.out.println("Balance USD "+balance);
			
			break;
			
		case 2:
			
				balance=acc.balanceCheck(account);
				System.out.println("Balance USD "+balance);
			
			break;
			
		case 3:
			
			CashDispense cash = new CashDispense();
						
				System.out.println("Enter amount to withdraw");
				amount = sc.nextInt();
				
				if(cash.isValidAmount(amount)) {
					charges=cash.charges(amount);
					balance=cash.balance(amount,charges,account);
					
					if(cash.isValidTransaction(balance,account)) {
						account.setBalance(balance);
						System.out.println("Charges USD "+charges);
						System.out.println("Balance USD "+balance);
					}
					else
						System.out.println("Insufficient minimum balance");
				}
				else
					System.out.println("Please correct the amount of value. It should be multiple of USD 5"
							+ "");					
		
			break;
			
		case 4:
			
			SwipeShopping shop = new SwipeShopping();			
	
				System.out.println("Enter amount to swipe");
				amount = sc.nextInt();
				
				charges=shop.charges(amount);
				balance=shop.balance(amount,charges,account);
					
				if(shop.isValidTransaction(amount,account)) {
					account.setBalance(balance);
					System.out.println("Charges USD "+charges);
					System.out.println("Balance USD "+balance);
				}
				else
					System.out.println("Insufficient minimum balance");
		
			break;
			
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Please select a valid option");	
		}
		}
		}
		else
			System.out.println("Enter valid account number");
	}
}

