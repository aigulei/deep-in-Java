package com.ai.base.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericWildcardsTypeDemo {
	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<>();
		upperBoundedWildcards(numbers);

		unboundedWildcards(numbers);
	}
	
	private static void lowerBoundedWildcards(List<Number> numbers) {
		lowerBoundedWildcardsDemo(numbers,numbers);
	}
	
	
	private static void lowerBoundedWildcardsDemo(List<? extends Number> producer,List<? super Number> consumer) {
//		producer.add(Integer.valueOf(1));
//		producer.add((short)2);
	}

	private static void unboundedWildcards(List<Number> numbers) {
		// 完全通配类型
		// 在运行时与非通配泛型会出现方法签名冲突
		// 然后完全通配类型可以适配任意类型，比如集合
		// 反而具体类型泛型反而会限制类型范围
		unboundeWildcardsDemo(numbers);
	}
	
	private static void upperBoundedWildcards(List<Number> numbers) {
		numbers.add(Byte.valueOf((byte) 1));
		numbers.add(Short.valueOf((short) 2));
		numbers.add(Integer.valueOf(3));

		List<Byte> bytes = Arrays.asList((byte) 1);
		List<Short> shorts = Arrays.asList((short) 2);
		List<Integer> integers = Arrays.asList(3);
		numbers.addAll(bytes);
		numbers.addAll(shorts);
		numbers.addAll(integers);
		forEach(numbers, System.out::println);
	}
	
	public static void unboundeWildcardsDemo(Iterable<?> iterable) {
		for (Object o : iterable) {
			System.out.println(o);
		}
	}

	
//	public static void unboundeWildcardsDemo(Iterable<Object> iterable) { 
//		for(Object o:iterable) { 
//			System.out.println(o); 
//		} 
//	}
	 

	public static void forEach(Iterable<? extends Number> iterable, Consumer<Object> consumer) {
		for (Object object : iterable) {
			consumer.accept(object);
		}
	}
}
