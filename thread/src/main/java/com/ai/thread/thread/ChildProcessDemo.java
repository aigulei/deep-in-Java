package com.ai.thread.thread;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class ChildProcessDemo {
	public static void main(String[] args) throws IOException {
		OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
		System.out.println(operatingSystemMXBean.getArch());
		System.out.println(operatingSystemMXBean.getAvailableProcessors());
		System.out.println(operatingSystemMXBean.getSystemLoadAverage());
		System.out.println(operatingSystemMXBean.getVersion());
		System.out.println(operatingSystemMXBean.getObjectName());
		System.out.println(operatingSystemMXBean.getName());
		if(operatingSystemMXBean.getName().startsWith("Windows")) {
			Runtime.getRuntime().exec("start");
		}
		//Runtime.getRuntime().exec("");
	}
}
