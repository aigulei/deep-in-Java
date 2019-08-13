package com.ai.base;

import java.util.HashMap;
import java.util.Map;

public class Main007 {
	public static Integer parseInt(String s) {
		return (s==null)?(Integer)null:Integer.parseInt(s);
	}
	public static void main(String[] args) {
		
		 //System.out.println(parseInt("-1")+" "+ parseInt(null)+" "+ parseInt("1"));
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("a", "o");
		 map.put("b", null);
		 System.out.println(map.getOrDefault("b", "ooxx"));
		 System.out.println(map.getOrDefault("c","xxoo"));
		
	}
	
}
