package com.samsung.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactDetails {

	@Column(name="mno", length=10)
	private String mobileNumber;
	
	@Column(name="mail", length=15)
	private String emailId;
	
	@Column(name="adl1", length=10)
	private String addressLine1;
	
	@Column(name="adl2", length=10)
	private String addressLine2;
	
	@Column(name="city", length=10)
	private String city;
	
	@Column(name="state", length=10)
	private String state;
	
	public ContactDetails() {
		
	}
	public ContactDetails(String mobileNumber, String emailId, String addressLine1, String addressLine2, String city,
			String state) {
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
