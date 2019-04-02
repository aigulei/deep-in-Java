package com.ai.base.collections.advanced;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;


public class WeakReferenceMapDemo {
	public static void main(String[] args)throws Exception {
		demoWeakHashMap();
	}
	
	private static void demoWeakHashMap() throws Exception {
		//强引用
		//value变量是局部变量，存放在栈
		//abc是常量，在java8之前存放在Perm区域，java8之后存放在Meta区域
		//在demoWeakHashMap方法执行之后，value会被立即回收，abc常驻
		String value = "abc";
		
		//弱引用
		WeakReference<User> userReference = new WeakReference<User>(new User("zhangsan"));
		
		//WeakReference集成为Reference,Reference入队ReferenceQueue
		//获取引用对象
		//User user = userReference.get();
		
		//ReferenceQueue queue = new ReferenceQueue();
		
		for(int i=0;i<100;i++) {
			Thread.sleep(1*1000);
			System.out.println(userReference.get());
		}
	}
	
	private static class User {
		
		private String name ;
		
		public User(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "User [name=" + name + "]";
		}
		
		
		
	}
}
