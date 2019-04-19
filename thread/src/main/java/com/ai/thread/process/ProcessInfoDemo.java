package com.ai.thread.process;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ProcessInfoDemo {
	public static void main(String[] args) {
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		
		String name = runtimeMXBean.getName();
		
		String pid = name.substring(0, name.indexOf("@"));
		
		System.out.println("[java 9 之前的方法] 当前进程ID："+pid);
		Instant instant = Instant.ofEpochMilli(runtimeMXBean.getStartTime());
		LocalDateTime ofInstant = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println("进程PID的启动时间："+ ofInstant);
		
		System.out.println("进程PID的上线时长："+runtimeMXBean.getUptime());
		System.out.println("当前进程线程数量:"+threadMXBean.getThreadCount());
	}
}
