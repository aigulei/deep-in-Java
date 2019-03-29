package com.ai.base.generic;

import java.util.Arrays;
import java.util.List;

public class GenericTypeErasureDemo {
	public static void main(String[] args) {
		A<String> a = new A<>();
		C c = new C();
		List<Integer> asList = Arrays.asList(1,2,3,4);
		//asList.add(5);
		System.out.println(asList.getClass());
		asList.set(3, 9);
		System.out.println(asList);
	}
	public static class A<T>{
		
	}
	
	public static class C implements Comparable<C>{
		@Override
		public int compareTo(C o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
