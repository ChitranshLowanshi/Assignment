package com.technoelevate.advancedjava.multithreading;

public class Program2 extends Thread{

  @Override
	public void run() {
for (int i = 0; i < 12; i++) {
	System.out.println("program2 thred running");
}
	}

}
