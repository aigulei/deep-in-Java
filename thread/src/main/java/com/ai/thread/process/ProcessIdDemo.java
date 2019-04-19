package com.ai.thread.process;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ProcessIdDemo {
	
	public static void main(String[] args) throws IOException {
		getProcessIdInLegacyWay();
		
		getProcessId();
	}

	private static void getProcessId() {
		
	}

	private static void getProcessIdInLegacyWay() throws IOException {
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		
		String name = runtimeMXBean.getName();
		
		String pid = name.substring(0, name.indexOf("@"));
		
		System.out.println("[java 9 之前的方法] 当前进程ID："+pid);
		
		System.in.read();
	}
}
