package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// @DiscriminatorValue(value = "M")
// @Table(name = "mgrs")
@Table(name = "onlymgrs")
public class Manager extends Employee implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name = "bonus")
	private Integer bonus;
	
	public Manager() {
		/* default constructor */
	}

	public Manager(Integer empId, String empName, Double salary, Integer bonus) {
		super(empId, empName, salary);
		this.bonus = bonus;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return String.format("Manager [bonus=%s, toString()=%s]", bonus, super.toString());
	}
	
	
	
	
}
