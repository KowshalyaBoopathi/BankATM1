package com.bank;

import java.util.ArrayList;

public class AccountDetails {
	
	static ArrayList<Account> list;
	
	static {
		
		list = new ArrayList<Account>();
		Account a1 = new Account(30, 890, 250, 100);
		Account a2 = new Account(31, 891, 350, 100);
		Account a3 = new Account(32, 892, 450, 100);
		Account a4 = new Account(33, 893, 250, 100);
		Account a5 = new Account(34, 894, 1000, 100);
		Account a6 = new Account(35, 895, 1250, 100);
	
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		
	}
		
}
//ArrayList <Account> list1 = new ArrayList<Account>();
