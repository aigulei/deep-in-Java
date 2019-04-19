package com.ai.thread.concurrency;


public class SynchronizedObjectAndClassDemo {
	
	public static void main(String[] args) {
		Object object =  new Object();
		
		//对象锁
		synchronized (object) {
			//对象存放在Heap（堆）
		}
		//类锁
		synchronized (Object.class) {
			//类对象存在Metadata（Java8之后)或者perm区域（Java7之前）
		}
	}
}
