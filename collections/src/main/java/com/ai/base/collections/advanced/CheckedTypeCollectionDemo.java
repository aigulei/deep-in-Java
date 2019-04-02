package com.ai.base.collections.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckedTypeCollectionDemo {
	public static void main(String[] args) {
		//List元素类型是java.lang.Integer
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(1,2,3));
		//引用List<Integer>类型的对象values
		List referencedValues = values;
		System.out.println(referencedValues==values);
		referencedValues.add("A");
		
		for(Object o:values) {
			System.out.println(o);
		}
		
		//泛型是编译时检查，运行时擦写
		//运行时的数据List<Integer> == List<Object> == List
		//Collections.checked接口是补充泛型集合在运行时出现擦写中的不足
		List<Integer> checkedTypeValues = Collections.checkedList(values, Integer.class);
		
		referencedValues = checkedTypeValues;
		System.out.println(referencedValues==checkedTypeValues);

		referencedValues.add("B");
		
	}
}
