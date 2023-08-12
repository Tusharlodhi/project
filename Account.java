package com.lab4.ex1;

public class Account {
	private long accNum;
	private Double balance;
	Person accHolder;
	
	public Account() {
		super();
	}

	public Account(long accNum, Double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amt)
	{
		if(accHolder.getName().equals("Ram"))
		     balance = balance+amt;
	}
	public void withdraw(double amt)
	{
		if(accHolder.getName().equals("Sham"))
		     balance = balance-amt;
	}
	public void display()
	{
		System.out.println("Name:"+accHolder.getName()+"\nAge:"+accHolder.getAge()+"\nAcc Number:"+accNum+"\nBalance:"+balance);
	}

}
