package com.ai.base.collections.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableModificationDemo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(Arrays.asList(1,2,3));
		
		Iterator<Integer> iterator = values.iterator();
		
		while(iterator.hasNext()) {
			//List.add(T) 方法在next()调用之前会报错
			//values.add(4);
			//remove()方法在next方法调用之前执行会抛出java.lang.IllegalStateException
			iterator.remove();
			Integer value = iterator.next();
			System.out.println(value);
			//结论：Iterable只能在next()方法执行后，通过remove()移除数据
			//values.add(4);
		}
	}
}
