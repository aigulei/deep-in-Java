package com.ai.base.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapAndSetDemo {
	public static void main(String[] args) {
		//通常Set是Map key的实现，Set底层运用Map实现
		//比如HashSet底层运用了HashMap
		Map<String, Object> map = new HashMap<String, Object>();
		Set<String> set = new HashSet<String>();
		//TreeSet底层运用了TreeMap
		map = new TreeMap<String, Object>();
		set = new TreeSet<String>();
	}
}
