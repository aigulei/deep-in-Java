package com.ai.thread.concurrency;


public class SynchronizedMethodAndBlockDemo {
	
	public static void main(String[] args) {
		echo("Hello,World");
		doEcho("Hello,World");
	}
	
	private static void doEcho(String message) {
		Object object = new Object();
		synchronized (object) {
			echo(message);
		}
	}
	/**
	 * synchronized修饰方法
	 * @param message
	 */
	private synchronized static void echo(String message) {
		System.out.println(message);
	}
}
