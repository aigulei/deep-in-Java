package com.ai.base.collections.algorithm;

import java.util.stream.Stream;

public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

	@Override
	public void sort(T[] values) {
		int size = values.length;
		
		for(int i = 0;i<size;i++) {
			T t = values[i];
			for(int j =i+1;j<size;j++) {
				if(t.compareTo(values[j])==1) {
					values[i] = values[j];
					values[j] = t;
					break;
				}
			}
			System.out.println(values);
		}
	}
	
	public static void main(String[] args) {
		Integer[] values = Sort.of(3,1,2,4,5);
		Sort<Integer> sort = new BubbleSort<Integer>();
		sort.sort(values);
		Stream.of(values).forEach(System.out::println);
	}
	
}
