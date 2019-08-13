package com.ai.base;

public class Main006 {
	private static boolean initialized = false;
	
	static {
		Thread thread = new Thread(()->{
			initialized = true;
		});
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println(initialized);
	}
}
