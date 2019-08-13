package com.ai.base;

public class Main002 {
	public static void main(String[] args) {
		final int start = Integer.MAX_VALUE-100;
		final int end = Integer.MAX_VALUE;
		int count = 0;
		for(int i=start;i<=end;i++)//注意小于等于
			count++;
		System.out.println(count);
	}
}
