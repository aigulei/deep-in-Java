package com.ai.base.collections.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafeDemo {
	public static void main(String[] args) {
		//demoFailFast();
		demoFailSafe();
	}
	
	private static void demoFailSafe() {
		List<Integer> values = new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3));
		removeForEach(values);
	}
	
	private static void demoFailFast() {
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(1,2,3));
		removeForEach(values);
		
	}
	
	private static void removeForEach(Collection<?> values) {
		try {
			for(Object value:values) {
				values.remove(value);
			}
			System.out.println("集合删除成功，目前集合大小:"+values.size());
		} catch (Exception e) {
			System.out.println("Fail-Fast异常");
		}
	}
	
}
