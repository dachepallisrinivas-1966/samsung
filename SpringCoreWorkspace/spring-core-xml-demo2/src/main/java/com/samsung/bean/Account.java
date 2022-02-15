package com.samsung.bean;

public class Account {
	private int accountNumber;
	private String bank;
	private String branch;
	
	
	public void setUp() {
		System.out.println("set up method ...");
	}
	
	public void tearDown() {
		System.out.println("tear down method ...");
	}
	
	public Account() {
		System.out.println("constructor ....");
		/* default constructor */
	}

	public Account(int accountNumber, String bank, String branch) {
		System.out.println("account contructor ...");
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.branch = branch;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return String.format("Account [accountNumber=%s, bank=%s, branch=%s]", accountNumber, bank, branch);
	}
	
}