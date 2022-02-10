/* method-local inner class (local class) 
 * 
 * a class defined inside a method is called as "local class".
 * only the method in which the class is defined, can create an instance of this class.
 * 
 */

package com.samsung.ui;

public class App3 {

	private int v = 10;

	public void someMethod() {
		
		class LocalClass {
			public void print() {
				System.out.printf("Local class. Outer class value %d\n", v);
			}
		}
		
		LocalClass obj = new LocalClass();
		obj.print();
	}
	
	public static void main(String[] args) {
		App3  obj = new App3();
		obj.someMethod();
	}

}