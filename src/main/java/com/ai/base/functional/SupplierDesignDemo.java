package com.ai.base.functional;

import java.util.function.Supplier;

public class SupplierDesignDemo {
	public static void main(String[] args) {
		echo("Hello,World");
		echo(()->{
			sleep(1000);
			return "Hello,World";
		});
	}
	private static void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static String getMessage() {
		sleep(1000);
		return "Hello,World";
	}
	
	private static Supplier<String> supplyMessage(){
		return SupplierDesignDemo::getMessage;
	}
	
	public static void echo(String message) {//拉的模式
		System.out.println(message);
	}
	
	public static void echo(Supplier<String> message) {//类似于推的模式
		System.out.println(message.get());
	}
}
