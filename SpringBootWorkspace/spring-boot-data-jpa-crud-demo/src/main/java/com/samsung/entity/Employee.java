package com.samsung.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "sbwcd_employees")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	
	@Column(name = "full_name", length = 40)
	@NotEmpty(message = "full name cannot be empty")
	@NotNull(message = "full name cannot be null")
	private String fullName;
	
	@Column(name = "basic_salary")
	@Min(value = 10000, message="salary cannot be less than 10000")
	@Max(value = 50000, message="salary cannot be more than 50000")
	private BigInteger basicSalary;
	
	@Column(name = "join_date")
	@DateTimeFormat(iso = ISO.DATE)		// yyyy-mm-dd
	@PastOrPresent(message = "join date cannot be a future date")
	private LocalDate joinDate;
	
	@Column(name = "dept_name", length = 20)
	@Enumerated(EnumType.STRING)
	private Department deptName;
	
	@Column(name = "mobile", length = 10)
	@Pattern(regexp = "[1-9][0-9]{9}", message = "invalid mobile number")
	@NotNull(message = "mobile number cannot be null")
	private String mobile;
	
	@Column(name = "email", length = 50)
	@NotNull(message = "email id cannot be null")
	@Email(message = "email is in invalid format")
	private String email;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(
			@NotEmpty(message = "full name cannot be empty") @NotNull(message = "full name cannot be null") String fullName,
			@Min(value = 10000, message = "salary cannot be less than 10000") @Max(value = 50000, message = "salary cannot be more than 50000") BigInteger basicSalary,
			LocalDate joinDate, Department deptName,
			@Pattern(regexp = "[1-9][0-9] {9}", message = "invalid mobile number") @NotNull(message = "mobile number cannot be null") String mobile,
			@NotNull(message = "email id cannot be null") @Email(message = "email is in invalid format") String email) {
		this.fullName = fullName;
		this.basicSalary = basicSalary;
		this.joinDate = joinDate;
		this.deptName = deptName;
		this.mobile = mobile;
		this.email = email;
	}

	public Long getEmpId() {
		return empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigInteger getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(BigInteger basicSalary) {
		this.basicSalary = basicSalary;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Department getDeptName() {
		return deptName;
	}

	public void setDeptName(Department deptName) {
		this.deptName = deptName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format(
				"empId=%s, fullName=%s, basicSalary=%s, joinDate=%s, deptName=%s, mobile=%s, email=%s",
				empId, fullName, basicSalary, joinDate, deptName, mobile, email);
	}
}
