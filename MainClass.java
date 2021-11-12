package com.technoelevate.advancedjava.multithreading;

public class MainClass {
public static void main(String[] args) {
	Program1 program1= new Program1();
	program1.start();
	Program2 program2= new Program2();
	program2.start();
	for (int i = 0; i < 16; i++) {
		System.out.println("Main thread running");
	}
}
}
