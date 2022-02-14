package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// @DiscriminatorValue(value = "C")
// @Table(name = "cemps")
@Table(name = "onlycemps")
public class ContractEmployee extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "duration")
	private Integer duration;
	
	public ContractEmployee() {
		/* default constructor */
	}

	public ContractEmployee(Integer empId, String empName, Double salary, Integer duration) {
		super(empId, empName, salary);
		this.duration = duration;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return String.format("ContractEmployee [duration=%s, toString()=%s]", duration, super.toString());
	}
	
}
