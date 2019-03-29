package com.ai.base.functional;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Long> stringToLong = Long::valueOf;
		System.out.println(stringToLong.apply("123"));
		
		Function<Long, String> longToString = String::valueOf;
		System.out.println(longToString.apply(123L));
		
		Long apply = stringToLong.compose(String::valueOf).apply("1");
		System.out.println(apply);
	}
}
