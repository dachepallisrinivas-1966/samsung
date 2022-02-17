package com.samsung.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class BookModel {

	private Integer bcode;
	private String title;
	private Double price;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate publishDate;
	
	public BookModel() {
		
	}

	public Integer getBcode() {
		return bcode;
	}

	public void setBcode(Integer bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
