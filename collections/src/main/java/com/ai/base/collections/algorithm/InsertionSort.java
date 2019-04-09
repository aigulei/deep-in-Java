package com.ai.base.collections.algorithm;

import java.util.Arrays;
import java.util.stream.Stream;

public class InsertionSort<T extends Comparable<T>> implements Sort<T> {

	@Override
	public void sort(T[] values) {
		int size = values.length;
		for(int i =1;i<size;i++) {
			T t = values[i];
			for(int j=i-1;j>=0;j--) {
				if(t.compareTo(values[i])<1) {
					values[i]=values[j];
					values[j]=t;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Integer[] values = Sort.of(3,1,2,4,5);
		Sort<Integer> sort = new BubbleSort<Integer>();
		sort.sort(values);
		Stream.of(values).forEach(System.out::println);
	}
	
	
}
