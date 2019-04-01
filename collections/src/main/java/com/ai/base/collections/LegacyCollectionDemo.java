package com.ai.base.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class LegacyCollectionDemo {

	public static void main(String[] args) {
		//1.几乎所有实现是线程安全的
		vectorVsList();
		hashtableVsHashMap();
		enumerationVsEnum();
	}
	
	private static void enumerationVsEnum() {
		//Enumeration负责迭代早期实现,由于java.util.Iterator<E>从java1.2引入
		String value = "1,,3";
		StringTokenizer tokenizer = new StringTokenizer(value, ",");
		Enumeration enumeration = tokenizer;
		while(enumeration.hasMoreElements()) {//等价于Iterator.hasNext()
			String element = String.valueOf(enumeration.nextElement());//等价于Iterator.next
			System.out.println(element);
		}
		//Iterable从java5引入，用于for-each语句语法提升
	}
	
	private static void hashtableVsHashMap() {
		//Hashtable与HashMap
		//Hashtable
		//  实现Dictionary和Map接口
		//  线程安全
		// key与value 不允许 null
		//
		//HashMap实现Map接口
		//线程非安全(写操作)
		//value允许为null
		//特殊：ConcurrentHashMap 不允许 null value情况
		//如果value为空的话，ConcurrentHashMap在查询时，会产生歧义
		//到底是值为null，还是线程不可见
		ConcurrentHashMap<String,Object> map = new ConcurrentHashMap<String,Object>();
		map.put("1", "1");
	}
	
	private static void vectorVsStack() {
		//Vector 是FIFO
		//Stack是LIFO
	}
	
	private static void vectorVsList() {
		//Vector数组实现，对比ArrayList
		//Vector所有操作线程安全，使用synchronized实现。
		Vector<String> vector = new Vector<String>();
		List<String> list = new ArrayList<String>();
		
		//如果Vector在方法内部使用的话，synchronized修饰后的方法基本上没有太多性能消耗
	}
}
