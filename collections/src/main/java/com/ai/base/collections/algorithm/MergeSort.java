package com.ai.base.collections.algorithm;

import java.util.stream.Stream;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {
	
	public static void main(String[] args) {
		Integer[] values = Sort.of(3,1,2,4,5);
		Sort<Integer> sort = new MergeSort<Integer>();
		sort.sort(values);
		Stream.of(values).forEach(System.out::println);
	}
	
	@Override
	public void sort(T[] values) {
		sort(values, 0, values.length-1);
	}
	
	private void merge(Comparable<T>[] values,int low,int mid,int high) {
		//找到子数组进行合并
		//[3,1,2,5,4] n =5;
		//low = 0
		//high = 4
		//mid = 2
		//a1 = [0,mid]=[3,1,2] = mid(2)-low(0)+1 =3个元素
		//a2 = [mid+1,high]=[5,4]=high(4)-mid(2) = 2个元素
		int n1 = mid - low + 1;
		int n2 = high - mid;
		//非In-Place实现(创建新的数组)
		Comparable[] a1 = new Comparable[n1];
		Comparable[] a2 = new Comparable[n2];
		System.arraycopy(values, low, a1, 0, n1);
		System.arraycopy(values, mid+1, a2, 0, n2);
		
		//合并
		int k = low;//k临时保存低位索引
		int i=0,j=0;
		for(;i<n1&j<n2;i++,j++) {
			//如果a1与a2比较
			if(a1[i].compareTo(a2[j])<1) {
				values[k] = a1[i];
			}else {
				values[k] = a2[j];
			}
			k++;
		}
		//复制a1
		while(i<n1) {
			values[k] = a1[i];
			i++;
			k++;
		}
		//复制a2
		while(j<n2) {
			values[k]= a2[j];
			j++;
			k++;
		}
	}
	
	private void sort(T[] values,int low,int high) {
		if(low<high) {
			//[3,1,2,5,4] n =5;
			//low=0
			//high =4
			//mid = (0+4)/2 = 2
			//[0,mid]=[3,1,2]
			//[mid+1,high]=[5,4]
			//获取中间值
			int mid = (low+high)/2;
			//Divide
			//上半部
			sort(values,low,mid);
			//下半部
			sort(values,mid+1,high);
			//Conquer
			merge(values,low,mid,high);
		}
	}
}
