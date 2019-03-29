package com.ai.base.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;

public class GenericParameterTypeDemo {
	public static void main(String[] args) {
		Container<String> a = new Container("a");
		//Error:
		//Container<Integer> b = new Container("b");
		//编译时：为什么不报错？
		//StringBuffer是CharSequence子类
		//String（参数）也是CharSequence子类
		//运行时Object
		Container<StringBuffer> c = new Container("Hello,World");
		//通过构造器传递参数是String类型，运行时是Object，没有问题
		System.out.println(c.getElement());
		//不过当c对象申明的类型为Container<StringBuffer>时，E类型为StringBuffer，因此set<E>必须是StringBuffer
		c.set(new StringBuffer(2019));
		System.out.println(c.getElement());
		//Java 泛型对象操作时，看申明对象泛型参数类型
		add(new ArrayList<>(), "HelloWorld");
		add(new ArrayList<>(), 1);
		forEach(Arrays.asList(1,2,3,4,5),System.out::println);
	}
	
	//extends 申明它上限，E的上限类型是CharSequence
	public static class Container<E extends CharSequence>{
		private E element;
		
		public Container(E e){
			this.element = e;
		}
		
		public boolean set(E e) {
			this.element = e;
			return true;
		}

		public E getElement() {
			return element;
		}
	}
	//多界限泛型参数类型
	public static class C{}
	
	public static interface I{}
	
	public static interface I2{}
	
	public static class TemplateClass extends C implements I ,I2{
		
	}
	//多界限泛型参数类型extends 第一个类型运行时具体类也可以是接口
	//第二或更多参数类型必须是接口
	public static class Template <T extends C & I & I2>{
		
	}
	
	public static <C extends Collection<E> ,E extends Serializable> void add(C target,E e) {
		target.add(e);
	}
	
	public static <C extends Iterable<E> ,E extends Serializable> void forEach(C source,Consumer<E> consumer) {
		for(E e:source) {
			consumer.accept(e);
		}
	}
}
