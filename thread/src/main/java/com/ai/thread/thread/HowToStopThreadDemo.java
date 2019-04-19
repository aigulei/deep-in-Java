package com.ai.thread.thread;

import java.util.concurrent.Executors;

public class HowToStopThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		
		StoppableAction action = new StoppableAction();
		
		Thread thread = new Thread(action);
		
		//线程启动（并不一定执行）
		thread.start();
		
		Thread.sleep(5);
		//main线程调整stopped状态到true
		action.stop();
		
		thread.join();
		
		//如果线程池的话，以上方案可能存在问题
		Executors.newFixedThreadPool(2);//有且只有2个线程复用
		Executors.newCachedThreadPool();//几乎无限数量线程
		
	}
	
	private static class StoppableAction implements Runnable{
		
		private boolean stopped;
		
		@Override
		public void run() {
			if(stopped) {
				//通过异常的方式，可以kill线程
				System.out.println("Action 终止...");
				return;
			}
			System.out.println("Action 执行...");
		}
		public void stop() {
			this.stopped = true;
		}
		
	}
}
