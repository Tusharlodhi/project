package com.lab4.ex1;

public class AccountDemo {

	public static void main(String[] args) {
Account[] acc1 = new SavingAccount[2];
		
		acc1[0] = new SavingAccount(1011,2000.0,new Person("Ram",20));
     	acc1[1] = new SavingAccount(1022,1000.0,new Person("Sham",33));
     	
     	
		System.out.println("Before any transaction");
		acc1[0].display();
		System.out.println("*************************");
		acc1[1].display();
		System.out.println("**************************");
		
		acc1[0].deposit(2000.0);
		acc1[1].withdraw(900.0);
		System.out.println("After Updation:");
		
		acc1[0].display();	
		System.out.println("**************************");

		acc1[1].display();
		System.out.println("************************\n");
		System.out.println("if amount is less than minBalance");

		acc1[1].display();
		

	}

}
