package com.samsung.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samsung.exception.LibraryException;
import com.samsung.model.Book;

public class BookDAOImpl implements BookDAO {
	
	public static final String INS_QRY  = "INSERT INTO books(bcode, title, price, category) VALUES (?,?,?,?)";
	public static final String UPD_QRY = "UPDATE books SET title = ?, price = ?, category = ? WHERE bcode = ?";
	public static final String DEL_QRY = "DELETE FROM books WHERE bcode = ?";
	public static final String SELECT_ALL_QRY = "SELECT bcode, title, price, category FROM books";
	public static final String SELECT_BY_ID_QRY = "SELECT bcode, title, category FROM books WHERE bcode = ?";

	@Override
	public Book add(Book book) throws LibraryException {
		if (book != null) {
			try(Connection con = ConnectionProvider.getConnection();
				PreparedStatement pst = con.prepareStatement(INS_QRY)) {
					pst.setInt(1, book.getBookCode());
					pst.setString(2, book.getTitle());
					pst.setDouble(3, book.getPrice());
					pst.setString(4, book.getCategory());
					pst.executeUpdate();
			}catch(SQLException excep) {
				throw new LibraryException("Sorry! An error occurred while inserting data");
			}
		}
		return book;
	}

	@Override
	public Book save(Book book) throws LibraryException {
		
		if (book != null) {
			try(Connection con = ConnectionProvider.getConnection();
				PreparedStatement pst = con.prepareStatement(UPD_QRY)) {
					pst.setString(1, book.getTitle());
					pst.setDouble(2, book.getPrice());
					pst.setString(3, book.getCategory());
					pst.setInt(4, book.getBookCode());
					
					pst.executeUpdate();
			}catch(SQLException excep) {
				throw new LibraryException("Sorry! An error occurred while updating data");
			}
		}
		return book;
	}

	@Override
	public void remove(Integer bookCode) throws LibraryException {
		
		try(Connection con = ConnectionProvider.getConnection();
				PreparedStatement pst = con.prepareStatement(DEL_QRY)) {
					pst.setInt(1, bookCode);
					
					pst.executeUpdate();
			}catch(SQLException excep) {
				throw new LibraryException("Sorry! An error occurred while deleting data");
			}
	}

	@Override
	public List<Book> listAll() throws LibraryException {
		List<Book> books = new ArrayList<>();
		try(Connection con = ConnectionProvider.getConnection();
				PreparedStatement pst = con.prepareStatement(SELECT_ALL_QRY)) {
				ResultSet rs = pst.executeQuery();
					
				Book book = null;
				while (rs.next()) {
					book = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
					books.add(book);
				}
			}catch(SQLException excep) {
				throw new LibraryException("Sorry! An error occurred while fetching data");
			}
		return books;
	}

	@Override
	public Book getById(Integer bookCode) throws LibraryException {
		Book book = null;
		try(Connection con = ConnectionProvider.getConnection();
				PreparedStatement pst = con.prepareStatement(SELECT_BY_ID_QRY)) {
				pst.setInt(1, bookCode);
				ResultSet rs = pst.executeQuery();
					
				if (rs.next()) {
					book = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
				}
			}catch(SQLException excep) {
				throw new LibraryException("Sorry! An error occurred while fetching data");
			}
		return book;
	
	}

}
