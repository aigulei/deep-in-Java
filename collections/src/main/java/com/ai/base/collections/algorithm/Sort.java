package com.ai.base.collections.algorithm;

public interface Sort<T extends Comparable<T>> {
	
	void sort(T[] values);
	
	static <T> T[] of(T... values) {
		return values;
	}
}
