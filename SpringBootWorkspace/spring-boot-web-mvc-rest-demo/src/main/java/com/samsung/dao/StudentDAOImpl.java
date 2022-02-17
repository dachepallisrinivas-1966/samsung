package com.samsung.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.samsung.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	List<Student> students = new ArrayList<>();
	
	@PostConstruct
	public void setup() {
		students.add(new Student(1, "Lavanya", "US"));
		students.add(new Student(2, "Supriya", "India"));
		students.add(new Student(3, "Akhil", "US"));
		students.add(new Student(4, "Sreeja", "IND"));
	}
	
	@Override
	public List<Student> findAll() {
		return students;
	}

	@Override
	public Student findById(int id) {
		return students.get(--id);
	}

	@Override
	public Student findByName(String name) {
		Student student = null;
		for(Student tempStudent : students) {
			if (tempStudent.getName().equals(name)) {
				student = tempStudent;
			}
		}
		return student;
	}

	@Override
	public void saveStudent(Student student) {
		students.add(student);
	}

	@Override
	public void deleteStudent(int id) {
		students.remove(--id);
		
	}
	
	

}