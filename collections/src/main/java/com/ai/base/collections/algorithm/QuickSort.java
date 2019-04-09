package com.ai.base.collections.algorithm;

import java.util.stream.Stream;

public class QuickSort<T extends Comparable<T>> implements Sort<T> {

	@Override
	public void sort(T[] values) {
		int n = values.length;
		int low =0;
		int high = n-1;
		
		sort(values, low, high);
		
	}
	private void sort(T[] values, int low, int high) {
		if(low<high) {
			int pIndex =partition(values, low, high);
			sort(values,low,pIndex-1);
			sort(values,pIndex,high);
		}
	}
	/**
	 * 	获取分区索引
	 * @param values 数组对象
	 * @param low	  低位索引
	 * @param high	  高位索引
	 * @return	分区索引
	 */
	int partition(T[] values,int low,int high) {
		//获取pivot=values[high]
		//[3,1,2,5,4]
		//pivot =4;
		//
		//[0] = 3 <4(0)
		//[1] = 1 <4(1)
		//[2] = 2 <4(2)
		//[3] = 5 >4(3)
		//=> [(3,1,2),(4),(5)]
		T pivot = values[high];
		
		int i =low-1;
		for(int j=low;j<high;j++) {
			if(values[j].compareTo(pivot)<1) {
				i++;
				T temp = values[i];
				values[i] = values[j];
				values[j] = temp;
			}
		}
		T temp = values[i+ 1];
		values[i+1] = values[high];
		values[high] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		Integer[] values = Sort.of(3,1,2,4,5);
		Sort<Integer> sort = new QuickSort<Integer>();
		sort.sort(values);
		Stream.of(values).forEach(System.out::println);
	}
	
}
