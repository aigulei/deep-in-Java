package com.ai.base.functional;

import java.util.function.Function;

public class FunctionDesignDemo {
	
	public static void main(String[] args) {
		Function function = a -> a ;
		
		Function<Integer, Integer> f2 = a -> a/2;
	}
}
