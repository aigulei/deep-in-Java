package com.ai.base.collections.advanced;

import java.util.Arrays;

public class ImmutableArrayDemo {
	
	public static void main(String[] args) {
		Integer[] values = OfDouble(1,2,3,200);
		//数组的特性：长度不变（特殊不变），内容可被替换
		Integer[] valuesCopy = Arrays.copyOf(values, values.length);
		
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i] == valuesCopy[i]);
		}
		//修改复制后的内容
		valuesCopy[0] = 99;
		System.out.println(Arrays.toString(values));
		Integer[] newValues = new Integer[3];
		
		User[] users = of(1L,2L,3L);
		User[] usersCopy = Arrays.copyOf(users, users.length);
		
		//修改usersCopy的第一个User对象
		User user1 = usersCopy[0];
		user1.id = 99L;
		//输出老users，检查是否users的第一个对象会不会被修改
		System.out.println(Arrays.asList(users));
		//结论：1：数组的copy与集合对象的clone类似，浅克隆（复制）
		//2:如果需要只读数组的话，需要深度clone（复制）
	}
	
	private static User[] of(Long... ids) {
		User[] users = new User[ids.length];
		for(int i=0;i<ids.length;i++) {
			users[i] = new User(ids[i]);
		}
		return users;
	}
	
	private static class User{
		private Long id;
		
		public User(Long id) {
			this.id = id;
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "User [id=" + id + "]";
		}
		
		
	}
	
	private static Integer[] OfDouble(Integer... values) {
		return values;
	}

}
