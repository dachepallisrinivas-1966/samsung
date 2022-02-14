package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
// @Table(name = "allemps")
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.CHAR)
// @DiscriminatorValue(value = "E")

// @Table(name = "emps")
// @Inheritance(strategy = InheritanceType.JOINED)

@Table(name = "onlyemps")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@Column(name = "emp_name", length = 10)
	private String empName;
	
	@Column(name = "salary")
	private Double salary;

	public Employee() {
		/* default constructor */
	}
	
	
	public Employee(Integer empId, String empName, Double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, salary=%s]", empId, empName, salary);
	}
}
