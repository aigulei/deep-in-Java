package com.ai.base;

import java.util.Random;

public class Main008 {
	public static void main(String[] args) {
		Random rnd = new Random();
		boolean toBe = rnd.nextBoolean();
		Number result = (toBe||!toBe)?
				new Integer(3):new Float(1);
		System.out.println(result);
	}
}
