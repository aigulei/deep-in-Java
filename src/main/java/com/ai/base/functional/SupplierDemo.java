package com.ai.base.functional;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Long> supplier = getLong();
		Long long1 = supplier.get();
		System.out.println(long1);
	}
	
	public static Supplier<Long> getLong(){
//		return ()->{
//			return System.currentTimeMillis();
//		};
		return System::currentTimeMillis;
	}
}
