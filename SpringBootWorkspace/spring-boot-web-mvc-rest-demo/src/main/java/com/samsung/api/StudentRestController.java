package com.samsung.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samsung.dao.StudentDAO;
import com.samsung.model.Student;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping(value = "/students")
	public ResponseEntity<List<Student>> findAll() {
		List<Student> students = studentDAO.findAll();
		// return ResponseEntity.status(HttpStatus.OK).body(students);	
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@GetMapping(value = "/students/{id}")
	public Student findById(@PathVariable int id) {
		return studentDAO.findById(id);
	}
	
	@PostMapping(value = "/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		studentDAO.saveStudent(student);
		// return ResponseEntity.status(HttpStatus.CREATED).body(student);
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/students/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
		studentDAO.deleteStudent(id);
		// return ResponseEntity.status(HttpStatus.CREATED).body(student);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
