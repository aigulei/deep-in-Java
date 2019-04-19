package com.ai.thread.thread;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(ThreadDemo::sayHelloWorld) ;
		thread.start();
		thread.join();
	}
	
	public static void sayHelloWorld() {
		System.out.printf("线程[ID:%s]:Hello,World!\n",Thread.currentThread().getId());
	}
}
