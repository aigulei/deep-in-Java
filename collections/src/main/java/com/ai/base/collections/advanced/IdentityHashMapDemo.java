package com.ai.base.collections.advanced;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;




public class IdentityHashMapDemo {
	public static void main(String[] args) {
		//普通的HashMap是Key的hashCode和equals来实现
		//如果类覆盖了Object的equals（Object）方法，那么hashCode需不需要覆盖？
		//答案：不强制覆盖，建议实现，注意不要将hashCode作为equals方法的实现
		//Objects.hashCode(Object...)以及Arrays.hashCode(Object[]).hashCode是一个计算较重的实现
		//equals通常是做对象属性的比较
		//如果覆盖了Object的hashCode，需不需要覆盖equals方法？
		//说明：hashCode是用于hash计算的，例如普通的HashMap，由于不同的hashCode方法可能返回相同的数据
		//原因：int数据范围2^31-1，原因：hashCode计算的问题
		//不同对象hashCode相同时，再做对象equals（Object）
		demoHashMap();
		
		//场景，需要对对象本身做鉴别
		demoIdentityHashMap();
		//System.identityHashCode()与覆盖hashCode（Object）的差异;
		Object a = new Object();
		demoIdentityHashCodeAndObjectHashCode(a,a);
//		Object b = new Object();
//		demoIdentityHashCodeAndObjectHashCode(a,b);
//		String string1 = new String("1");
//		String string2 = "1";
//		demoIdentityHashCodeAndObjectHashCode(string1, string2);
		
		String string1 = "1";
		String string2 = new String("1");
		demoIdentityHashCodeAndObjectHashCode(string1, string2);
	}
	
	private static void demoIdentityHashCodeAndObjectHashCode(Object a,Object b) {
		System.out.printf("System.identityHashCode(%s)==%d \n",a, System.identityHashCode(a));
		System.out.printf("%s.hasCode()==%d \n",a,a.hashCode());
		
		System.out.printf("System.identityHashCode(%s).hashCode()==System.identityHashCode(%s).hashCode()==%s \n",a,b,System.identityHashCode(a)==System.identityHashCode(b));
		
		System.out.printf("%s.hasCode()==%s.hashCode()==%s \n",a,b,a.hashCode()==b.hashCode());

	}

	private static void demoIdentityHashMap() {
		Map<String, Integer> map = new IdentityHashMap<>();
		demoMap(map);

	}
	private static void demoHashMap() {
		Map<String, Integer> map = new HashMap<>();
		demoMap(map);
	}
	
	private static void demoMap(Map<String, Integer> map) {
		map.put("A", 1);
		map.put(new String("A"), 2);
		System.out.println("A" == new String("A"));
		System.out.println("A".equals(new String("A")));
		System.out.println("A".hashCode()==new String("A").hashCode());
		System.out.println(map.size());
	}

	
}
