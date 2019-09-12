package com.niltech.performance.concurency;

public class CPUEfficiency {

	public static void main(String[] args) {
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("No of CPU cores : " + cores);
	}

}
