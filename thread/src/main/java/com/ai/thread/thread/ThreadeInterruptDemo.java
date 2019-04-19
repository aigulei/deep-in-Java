package com.ai.thread.thread;

public class ThreadeInterruptDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(ThreadeInterruptDemo::sayHelloWorld) ;
		
		thread.start();
		thread.interrupt();
		//interrupt()方法并不能终止线程，但是能传递状态
		thread.join();
	}
	
	public static void sayHelloWorld() {
		
//		if(Thread.currentThread().isInterrupted()) {
//			System.out.printf("线程[ID:%s]:被终止\n",Thread.currentThread().getId());
//			return;
//		}
		Object monitor = ThreadeInterruptDemo.class;
		
		synchronized (monitor) {
			try {
				monitor.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("adfa");
				return;
			}
		}
		
		System.out.printf("线程[ID:%s]:Hello,World!\n",Thread.currentThread().getId());
	}
}
