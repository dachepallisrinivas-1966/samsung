package com.samsung.model;

public abstract class Person {
	private String name;
	private int age;
	
	public Person() {
		/* no implementation required */
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name = " + name + "\t" + "Age = " + age;
	}
	
}
