package com.samsung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "jobs")
@DynamicInsert
@DynamicUpdate
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "job_id")
	private String jobId;
	@Column(name = "job_title")
	private String jobTitle;
	@Column(name = "min_salary")
	private Integer minSalary;
	@Column(name = "max_salary")
	private Integer maxSalary;
	
	public Job() {
		/* default constructor */
	}

	public Job(String jobId, String jobTitle, Integer minSalary, Integer maxSalary) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	public Integer getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return String.format("jobId=%s, jobTitle=%s, minSalary=%s, maxSalary=%s", jobId, jobTitle, minSalary,
				maxSalary);
	}
	
}
