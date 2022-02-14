package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emps1")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@Column(name = "emp_name", length = 10)
	private String empName;
	
	@Column(name = "basic", precision = 7, scale = 2)
	private Double basic;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_number")
	private Account salaryAccount;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(Integer empId, String empName, Double basic, Account salaryAccount) {
		this.empId = empId;
		this.empName = empName;
		this.basic = basic;
		this.salaryAccount = salaryAccount;
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

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Account getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(Account salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, basic=%s]", empId, empName, basic);
	}
	
}
