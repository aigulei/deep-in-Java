package com.ai.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main005 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Set s = new HashSet();
		s.add("foo");
		Iterator iterator = s.iterator();
		Method m = iterator.getClass().getMethod("hasNext", new Class[0]);
		m.setAccessible(true);
		System.out.println(m.invoke(iterator, new Object[0]));
	}
}
