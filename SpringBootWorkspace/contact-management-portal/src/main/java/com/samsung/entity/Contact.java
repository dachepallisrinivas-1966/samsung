package com.samsung.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "contacts")
public class Contact implements Serializable, Comparable<Contact>{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cid")
	@NotNull(message = "contact id is a mandatory field")
	@Min(value = 1, message = "contact id can not be zero or negative")
	private Long cid;

	@Column(name = "fnm", length = 50)
	@NotBlank(message = "full name cannot be blank")
	private String fullName;
	
	@Column(name = "email", length = 100)
	@NotBlank(message = "email cannot be blank")
	@Email(message = "email is in invalid format")
	private String email;
	
	@Column(name = "mobile", length=10)
	@NotBlank(message = "mobile number cannot be blank")
	@Pattern(regexp = "[1-9][0-9]{9}", message = "mobile number should be a 10 digit number")
	private String mobile;
	
	@Column(name = "dob")
	@NotNull(message = "date of birth cannot be null")
	@Past(message = "date of birth should not be a future date")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOfBirth;
	
	public Contact() {
		/* default constructor */
	}
	
	public Contact(
			@NotNull(message = "contact id is a mandatory field") @Min(value = 1, message = "contact id can not be zero or negative") Long cid,
			@NotBlank(message = "full name cannot be blank") String fullName,
			@NotBlank(message = "email cannot be blank") @Email(message = "email is in invalid format") String email,
			@NotBlank(message = "mobile number cannot be blank") @Pattern(regexp = "[1-9][0-9]{9}", message = "mobile number should be a 10 digit number") String mobile,
			@NotNull(message = "date of birth cannot be null") @Past(message = "date of birth should not be a future date") LocalDate dateOfBirth) {
		super();
		this.cid = cid;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(cid, dateOfBirth, email, fullName, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(cid, other.cid) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(email, other.email) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(mobile, other.mobile);
	}

	@Override
	public int compareTo(Contact o) {
		return this.cid.compareTo(o.cid);
	}
	
}


