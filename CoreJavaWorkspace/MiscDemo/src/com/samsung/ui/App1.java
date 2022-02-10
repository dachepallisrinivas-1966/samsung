/* Nested Classes - Types 
 * 1. Static member class
 * 2. Non-Static member class
 * 3. Method-local inner class
 * 4. Anonymous inner class
 */

/* Static member class */

package com.samsung.ui;

public class App1 {

	static public class Test4 {
		public void print() {
			System.out.println("static member class");
		}
		static public void print2() {
			System.out.println("static method in static member class");
		}
	}

	public void print() {
		System.out.println("outer class");
	}

	public static void main(String[] args) {
		App1.Test4 obj = new App1.Test4();
		obj.print();

		App1 obj2 = new App1();
		obj2.print();
		
		Test4 obj3 = new Test4();
		obj3.print();
		
		Test4.print2();
		
	}

}