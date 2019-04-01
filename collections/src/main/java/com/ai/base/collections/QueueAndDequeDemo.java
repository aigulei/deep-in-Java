package com.ai.base.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndDequeDemo {
	public static void main(String[] args) {
		Queue<String> queue =new LinkedList<String>();
		queue.add("A");
		queue.offer("a");
		System.out.println(queue);
	}
}
