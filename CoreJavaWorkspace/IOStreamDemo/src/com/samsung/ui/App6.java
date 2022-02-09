/* de-serialization */
package com.samsung.ui;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App6 {

	public static void main(String[] args) {
		try (FileInputStream fos = new FileInputStream("d:\\persons.dat");
			 ObjectInputStream oos = new ObjectInputStream(fos);) {
			System.out.println(oos.readObject());
			
		} catch(ClassNotFoundException | IOException exception) {
			exception.getMessage();
		}
	}

}
