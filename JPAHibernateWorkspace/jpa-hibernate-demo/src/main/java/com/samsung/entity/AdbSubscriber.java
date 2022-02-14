package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscribers")
public class AdbSubscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	
	@Column(name="fnm", length=10)
	private String first_name;
	
	@Column(name="lnm", length=10)
	private String last_name;
	
	@Embedded
	private ContactDetails subscriberContactDetails;
	
	public AdbSubscriber() {
		/* default constructor */
	}

	

	public AdbSubscriber(Integer sid, String first_name, String last_name) {
		this.sid = sid;
		this.first_name = first_name;
		this.last_name = last_name;
	}



	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public ContactDetails getSubscriberContactDetails() {
		return subscriberContactDetails;
	}

	public void setSubscriberContactDetails(ContactDetails subscriberContactDetails) {
		this.subscriberContactDetails = subscriberContactDetails;
	}

	@Override
	public String toString() {
		return "AdbSubscriber [first_name=" + first_name + ", last_name=" + last_name + ", subscriberContactDetails="
				+ subscriberContactDetails + "]";
	}
	
	
}
