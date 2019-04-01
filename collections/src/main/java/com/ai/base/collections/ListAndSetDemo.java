package com.ai.base.collections;

import java.util.HashSet;
import java.util.Set;


public class ListAndSetDemo {
	public static void main(String[] args) {
		//HashSet并不能保证顺序
		Set<String> values = new HashSet<String>();
		//有些场景可能误导
		//字符场景
		values.add("a");
		values.add("b");
		values.add("c");
		values.forEach(System.out::println);
	
		//数字场景
		values.clear();
		values.add("1");
		values.add("2");
		values.add("3");
		values.forEach(System.out::println);
		//以上列子是ASCII码
		//HashSet或者HashMap采用对象HashCode
		//StringhashCode是由char[]数组构建
		//在Java中char(2字节)相当于int（4字节)
		//汉字通过2个char（4字节），用一个int（4字节）表示
	}
}
