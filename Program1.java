package com.technoelevate.advancedjava.multi;

public class Program1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("program1 thread running");
		}
		
	}

}
