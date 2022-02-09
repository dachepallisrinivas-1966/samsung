/* Thread class methods */

package com.samsung.ui;
public class App01 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Name of the current thread = " + thread.getName());
		System.out.println("priority = " + thread.getPriority());
		System.out.println("thread id = " + thread.getId());
		System.out.println("is current thread alive? = " + thread.isAlive());
	}

}