package com.samsung.dao;

import java.util.List;

import com.samsung.model.Student;

public interface StudentDAO {
	List<Student> findAll();
	Student findById(int id);
	Student findByName(String name);
	void saveStudent(Student student);
	void deleteStudent(int id);
}