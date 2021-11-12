package com.technoelevate.advancedjava.synch;

public class Account {
int balance;

public Account(int balance) {
	super();
	this.balance = balance;
}
public synchronized void withdraw(int ammount) {
	if(ammount>balance) {
		System.out.println("insfi");
		return;
	}
	balance-=ammount;
	System.out.println("with sucss");
	System.out.println("Balance="+balance);
}
public void deposite(int ammount) {
	int temp=balance;
	temp+=balance;
	balance=temp;
	System.out.println("depo");
	System.out.println("avlvl="+balance);
}
public void checkBalance() {
	System.out.println("balance="+balance);
}
}
