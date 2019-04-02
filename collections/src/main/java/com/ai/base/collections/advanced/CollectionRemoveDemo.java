package com.ai.base.collections.advanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRemoveDemo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>(List.of(1,2,3));
		Iterator<Integer> iterator = values.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		values = new ArrayList<Integer>(List.of(1,2,3));
		for(int a:values) {
			values.remove(a);
		}
	}
}
