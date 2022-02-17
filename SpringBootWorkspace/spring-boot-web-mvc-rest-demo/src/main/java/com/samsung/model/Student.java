package com.samsung.model;

public class Student {
	private int id;
	private String name;
	private String country;
	
	public Student() {
		/* no implementation required */
	}
	
	public Student(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, country=%s]", id, name, country);
	}

	
	
}