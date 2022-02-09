package com.samsung.model;
import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	
	private transient String ATMPassword;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Person(String name, String email, String ATMpassword) {
		this.name = name;
		this.email = email;
		this.ATMPassword = ATMpassword;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, email=%s, ATMPassword=%s]", name, email, ATMPassword);
	}



//	@Override
//	public String toString() {
//		StringBuilder output = new StringBuilder("Name = ");
//		output.append(name);
//		if (email != null) {
//			output.append("Email = ");
//			output.append(email);
//		}
//		return output.toString();
//	}
}