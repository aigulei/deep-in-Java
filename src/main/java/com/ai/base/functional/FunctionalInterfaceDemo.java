package com.ai.base.functional;


public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Function1 f1 = () ->{
			
		};
		
		FunctionInterfaceWithoutAnnotation f2 = ()->{
			
		};
	}
	@FunctionalInterface
	public interface Function1{
		void execute();
		
		default String getString() {
			return String.valueOf(this);
		}
	}
	
	//@FunctionalInterface  FunctionalInterface并非必选
	public interface FunctionInterfaceWithoutAnnotation{
		void execute();
	}
}
