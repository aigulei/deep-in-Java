package com.ai.base;

import java.util.IdentityHashMap;
import java.util.Map;

public class Main009 {
	public static void main(String[] args) {
		Map map = new IdentityHashMap<>();
		map.put(1, "hello");
		map.putIfAbsent(1, "world");
		print(map.get(1));
		print(map.size());
		
		map.put(1024,"A");
		map.putIfAbsent(1024, "B");
		print(map.get(1024));
		print(map.size());
		
	}
	private static void print(Object object) {
		System.out.println(object+" ");
	}
}
