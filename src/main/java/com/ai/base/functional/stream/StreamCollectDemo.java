package com.ai.base.functional.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo {
	public static void main(String[] args) {
		List<Integer> values = Stream.of(1,2,3,4,5)
			.collect(Collectors.toList());
		
		System.out.println(values.getClass());
	}
}
