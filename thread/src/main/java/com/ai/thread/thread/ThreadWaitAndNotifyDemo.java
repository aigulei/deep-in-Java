package com.ai.thread.thread;

public class ThreadWaitAndNotifyDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(ThreadWaitAndNotifyDemo::sayHelloWorld) ;
		t1.setName("t1");
		t1.start();
		Thread t2 = new Thread(ThreadWaitAndNotifyDemo::sayHelloWorld) ;
		t2.setName("t2");
		t2.start();
		Object monitor = ThreadWaitAndNotifyDemo.class;
		
		synchronized (monitor) {
			
		}
		
		synchronized (monitor) {
			monitor.notifyAll();
		}
	}
	
	public static  void sayHelloWorld() {
		Object monitor = ThreadWaitAndNotifyDemo.class;
		synchronized (monitor) {
			try {
				System.out.printf("线程[%s]进入等待\n",Thread.currentThread().getName());
				monitor.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("线程[%s]恢复执行\n",Thread.currentThread().getName());
			System.out.printf("线程[ID:%s]:Hello,World!\n",Thread.currentThread().getId());

		}
	}
}
