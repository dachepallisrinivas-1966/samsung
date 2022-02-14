package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "acc_num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountNumber;
	
	@Column(name = "bank_name")
	private String bankName;
	
	public Account() {
		/* default constructor */
	}

	public Account(Integer accountNumber, String bankName) {
		this.accountNumber = accountNumber;
		this.bankName = bankName;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return String.format("Account [accountNumber=%s, bankName=%s]", accountNumber, bankName);
	}

}
