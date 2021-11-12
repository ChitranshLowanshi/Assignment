package com.technoelevate.advancedjava.multithreading.assignment;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		ThreadDemo2 demo2 = new ThreadDemo2();
		ThreadDemo demo = new ThreadDemo();
		demo.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main method statement running");

		}
		demo2.start();
	}
}
