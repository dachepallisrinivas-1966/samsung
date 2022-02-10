/* non-static member class (inner class) 
 * 
 * a class defined within another class without static modifier is called as non-static member class.
 * it is also called as "inner class".
 * 
 * inner class has access to all of the variable and methods of its outer class and can refer to them directly.
 
 * */

package com.samsung.ui;

public class App2 {

	private int m1 = 10;
	
	public class InnerClass {
		private int m2 = 20;
		public void print() {
			System.out.printf("m1 = %d m2 = %d", m1, m2);
		}
	}
	
	public void print() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
	
	public static void main(String[] args) {
		App2  obj = new App2();
		obj.print();
	}

}