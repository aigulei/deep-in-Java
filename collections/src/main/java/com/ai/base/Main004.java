package com.ai.base;

/**
 * Thread中有name这个变量，并且有setName这个方法
 * @author Administrator
 *
 */
public class Main004 {
	volatile String name = "ABC";
	void setName(String name) {
		this.name = name;
	}
	void backgroudSetName()throws InterruptedException{
		Thread thread = new Thread() {
				@Override
				public void run() {
					setName("DEF");
				}
		};
		thread.start();
		thread.join();
		System.out.println(name);
	}
	public static void main(String[] args) throws InterruptedException {
		new Main004().backgroudSetName();
	}

}
