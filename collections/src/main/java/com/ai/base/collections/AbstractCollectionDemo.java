package com.ai.base.collections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class AbstractCollectionDemo {
	public static void main(String[] args) {
		abstractList();
	}
	
	private static void abstractList() {
		//返回了Arrays.asList不允许写操作，但是允许下标数据交换
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		assert numbers instanceof AbstractList;
		
		//numbers.add(0);
		numbers.set(4, 0);
		numbers.forEach(System.out::println);
	}
}
