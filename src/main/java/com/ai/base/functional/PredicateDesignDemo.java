package com.ai.base.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDesignDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-1,1,2,3,4,5);
		Collection<Integer> filter = filter(numbers, t -> t%2 ==0);
		System.out.println(filter);
	}
	private  static <E> Collection<E> filter(Collection<E> source,Predicate<E> p){
		List<E> copy = new ArrayList<E>(source);
		Iterator<E> iterator = copy.iterator();
		while(iterator.hasNext()) {
			E element = iterator.next();
			if(!p.test(element)) {
				iterator.remove();
			}
		}
		return Collections.unmodifiableList(copy);
	}
}
