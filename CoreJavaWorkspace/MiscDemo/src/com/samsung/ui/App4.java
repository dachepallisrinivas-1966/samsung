/* Anonymous inner class 
 * 
 * Anonymous inner class combines the process of defining an inner class and 
 * creating an object of inner class into one step.
 * It is a class without any name.
 * 
 * syntax:
 * 
 * new  <superclass  or  interface> (optional arguments) {
 * 		members definition
 * }
 * 
 * the optional arguments are passed to constructor of super class.
 * 
 * anonymous class can extend either a class or implement an interface. 
 * No extends or implements keyword is required.
 */

package com.samsung.ui;

interface MyStack {
	void push(String value);
	String pop();
}

class SomeClass {

	public MyStack getStack() {
		// anonymous class implements interface
		return new MyStack() {
			@Override
			public void push(String v) {
				// code
			}

			@Override
			public String pop() {
				return null;
			}
		}; // end of anonymous class
	}
}

public class App4 {

	public static void main(String[] args) {
		SomeClass obj = new SomeClass();
		MyStack stack = obj.getStack();
		stack.push("One");
	}

}