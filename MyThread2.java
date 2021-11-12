package com.technoelevate.advancedjava.multithreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("MyThread2 is running");
			
		}
		
	}

}
