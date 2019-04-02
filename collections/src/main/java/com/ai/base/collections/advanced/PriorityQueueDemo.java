package com.ai.base.collections.advanced;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> integerQueue = new PriorityQueue<Integer>();
		integerQueue.add(1);
		integerQueue.add(2);
		integerQueue.add(3);
		integerQueue.add(1);
		integerQueue.forEach(System.out::println);
	}
}
