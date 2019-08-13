package com.ai.base;


public class Main001 {
	public Main001(Object o) {
		System.out.println("Object");
	}
	public Main001(double[] dArray) {
		System.out.println("double array");
	}
	
	public static void main(String[] args) {
		new Main001(null);
	}
}
