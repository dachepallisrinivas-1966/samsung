/* serialization */
package com.samsung.ui;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.samsung.model.Person;

public class App5 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("d:\\persons.dat");
		     ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				Person p = new Person("srinivas", "dachepallisrinivas@gmail.com", "1234");
				oos.writeObject(p);
				System.out.println("object serialized.");
			} catch (IOException exception) {
				exception.printStackTrace();
			}

	}

}
