package com.ai.base;

import java.util.HashSet;


public class Main003 {
	private String first,last;
	
	public Main003(String first,String last) {
		if(first==null||last==null)
			throw new NullPointerException();
		this.first = first;
		this.last = last;
	}
	
	public boolean equals(Main003 m) {
		return first.equals(m.first) && last.equals(m.last);
	}
	
	
	@Override
	public int hashCode() {
        return 31 * first.hashCode() + last.hashCode(); 
	}
	
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(new Main003("first", "last"));
		System.out.println(s.contains(new Main003("first", "last")));
	}
}
