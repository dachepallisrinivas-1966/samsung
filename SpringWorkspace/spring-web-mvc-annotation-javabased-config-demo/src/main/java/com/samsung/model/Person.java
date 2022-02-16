package com.samsung.model;

public class Person {
	private String name;
	private String emailId;
	private int age;

	public Person() {
		/* default constructor */
	}
	public Person(String name, String emailId, int age) {
		this.name = name;
		this.emailId = emailId;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
