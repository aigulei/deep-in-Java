package com.ai.thread.concurrency;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		synchronized (SynchronizedDemo.class) {
			Data data = new Data();
			data.setValue(1);
		}
	}
	
	public static void changeValue(int value) {
		Data data = new Data();
		data.setValue(1);
	}
	
	private static class Data{
		private int value;
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
	}
}
