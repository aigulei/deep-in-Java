package com.ai.java9.modular;

import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Field;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ModuleReflectionDemo {
	public static void main(String[] args) {
		Class<String> loggerClass = String.class;
		
		Field[] declaredFields = loggerClass.getDeclaredFields();
		
		Stream.of(declaredFields).forEach(System.out::println);
		
		
		Module module = loggerClass.getModule();
		
		String moduleName = module.getName();
		System.out.printf("类%s存在于%s模块之中\n",loggerClass.getName(),moduleName);
		
		ModuleDescriptor moduleDescriptor = module.getDescriptor();
		moduleDescriptor.requires().stream().forEach(requires ->{
			System.out.printf("requires模块名称%s, 修饰符定义:%s\n",requires.name(),requires.modifiers());
		});
		
		moduleDescriptor.exports().stream().forEach(exports ->{
			System.out.printf("exports包名称%s, targets:%s\n",exports.source(),exports.targets());
		});
	}
}
