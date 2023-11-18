package com.upskill.java_6;

public class MultiThreadingRunable implements Runnable {

	public void run() {
		try {
			System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Runnoing");
		} catch (Exception e) {
			System.out.println("Exception is caught");
			e.printStackTrace();

		}
	}
}
