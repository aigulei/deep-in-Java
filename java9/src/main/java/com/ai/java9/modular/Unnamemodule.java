package com.ai.java9.modular;

import java.util.Collections;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Unnamemodule {
	public static void main(String[] args) {
		MapUtils.isEmpty(Collections.EMPTY_MAP);
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext();
		context.close();
	}
}
