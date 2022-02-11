package com.samsung.dao;

import java.util.List;

import com.samsung.exception.LibraryException;
import com.samsung.model.Book;

public interface BookDAO {
	Book add(Book book) throws LibraryException;
	Book save(Book book) throws LibraryException;
	void remove(Integer bookCode) throws LibraryException;
	List<Book> listAll() throws LibraryException;
	Book getById(Integer bookCode) throws LibraryException;
}
