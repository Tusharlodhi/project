package com.lab4.ex1;

public class SavingAccount extends Account {
final double minBalance=500;
	
	public SavingAccount(long accnum, double bal,Person p)
	{
		super(accnum,bal,p);
	}
	
	public void withdraw(double amt)
	{
		if(getBalance()-amt>minBalance)
		{
			
		   setBalance(getBalance()-amt);
		}
		else
		{
			System.out.println("You can't withdraw");
		}
	}
		

}