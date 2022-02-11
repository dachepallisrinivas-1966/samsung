package com.samsung.service;

import java.util.ArrayList;
import java.util.List;

import com.samsung.dao.BookDAO;
import com.samsung.dao.BookDAOImpl;
import com.samsung.exception.LibraryException;
import com.samsung.model.Book;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;
	
	public BookServiceImpl() {
		bookDAO = new BookDAOImpl();
	}
	
	@Override
	public Book add(Book book) throws LibraryException {
		if (book != null) {
			validateBook(book);
			bookDAO.add(book);
		}
		return book;
	}

	@Override
	public Book save(Book book) throws LibraryException {
		if (book != null) {
			validateBook(book);
			bookDAO.save(book);
		}
		return book;
	}

	@Override
	public void remove(Integer bookCode) throws LibraryException {
		bookDAO.remove(bookCode);
	}

	@Override
	public List<Book> listAll() throws LibraryException {
		return bookDAO.listAll();
	}

	@Override
	public Book getById(Integer bookCode) throws LibraryException {
		return bookDAO.getById(bookCode);
	}
	
	private boolean isValidBookCode(int bookCode) {
		return bookCode > 0;
	}
	
	private boolean isValidTitle(String title) {
		return title != null && title.length() >= 3 && title.length() <= 50;
	}
	
	private boolean isValidPrice(double price) {
		return price >= 0;
	}
	
	private boolean isValidCategory(String category) {
		return category != null && category.length() >=3 && category.length() <= 50;
	}
	
	private void validateBook(Book book) throws LibraryException {
		List<String> errMessages = new ArrayList<>();
		
		if (!isValidBookCode(book.getBookCode())) {
			errMessages.add("Book code cannot be negative");
		}
		
		if (!isValidTitle(book.getTitle())) {
			errMessages.add("Book Title cannot be left blank and must be of 4 to 50 characters in length");
		}
		
		if (!isValidPrice(book.getPrice())) {
			errMessages.add("Price cannot be negative");
		}
		
		if (!isValidCategory(book.getCategory())) {
			errMessages.add("Categoy cannot be left blank and must be of 3 to 50 characters in length");
		}
		
		if (!errMessages.isEmpty()) {
			throw new LibraryException(errMessages.toString());
		}
	}

}
 