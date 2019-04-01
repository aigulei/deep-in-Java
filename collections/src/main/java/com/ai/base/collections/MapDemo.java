package com.ai.base.collections;

import java.util.Map;


public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(1, "A");
		System.out.println(map.get(1));
		System.out.println(map.get(Long.valueOf(1L).intValue()));
		System.out.println(map.get(new Key(1)));
	}
	
	private static class Key{
		private final int value;
		
		private Key(int value) {
			this.value = value;
		}

		@Override
		public int hashCode() {
			return value;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if(obj instanceof Integer) {
				return this.value == ((Integer)obj).intValue();
			}
			Key key = (Key)obj;
			return value == key.value;
		}
		
	}
}
