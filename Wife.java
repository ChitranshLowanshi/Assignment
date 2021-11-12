package com.technoelevate.advancedjava.synch;

public class Wife extends Thread{
Account acc;

public Wife(Account acc) {
	super();
	this.acc = acc;
}

@Override
public void run() {
	Thread.currentThread().setName("Wife Thread");
	System.out.println(Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
		acc.deposite(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
