package com.ai.base.functional;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer consumer = System.out::println;
		consumer.accept("Hello,World");
		
		Consumer<String> consumer2 = ConsumerDemo::echo;
		consumer2.andThen(consumer).accept("Hello,Sky");
	}
	
	private static void echo(String message) {
		System.out.println(message);
	}
}
