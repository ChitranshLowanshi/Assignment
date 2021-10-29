package com.technoelevate.javabasics.blockdemo;

public class StaticAndNonStaticBlock {
	public StaticAndNonStaticBlock() {
		System.out.println("parent class constructor");
	}
	{
		System.out.println("parent Non static block");
	}
	static {
		System.out.println("parent static block");
	}
	
}
