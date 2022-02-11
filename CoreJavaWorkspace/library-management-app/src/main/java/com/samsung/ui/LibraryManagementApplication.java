package com.samsung.ui;

import java.util.List;
import java.util.Scanner;

import com.samsung.exception.LibraryException;
import com.samsung.model.Book;
import com.samsung.service.BookService;
import com.samsung.service.BookServiceImpl;

public class LibraryManagementApplication {

	private static BookService bookService;
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		bookService = new BookServiceImpl();
		scan = new Scanner(System.in);
		LibraryOperations choice = null;
		
		while(choice != LibraryOperations.QUIT) {
			System.out.println("Choice\t\tMenu");
			for(LibraryOperations opt : LibraryOperations.values()) {
				System.out.println(opt.ordinal() + "\t\t" + opt);
			}
			System.out.println("Enter Choice : ");
			int ch = scan.nextInt();
			
			if (ch >= 0 && ch < LibraryOperations.values().length) {
				choice = LibraryOperations.values()[ch];
				
				switch (choice) {
				case ADD : doAdd();
						   break;
				case LIST: doList();
						   break;
				case DELETE: doDelete();
						     break;
				case QUIT: System.out.println("Application Terminated");
							break;
				}
			}
		}
		
	}
	
	private static void doAdd() {
		Book book = new Book();
		System.out.print("Enter bookcode : ");
		book.setBookCode(scan.nextInt());
		System.out.print("Enter title : ");
		book.setTitle(scan.next());
		System.out.print("Enter price : ");
		book.setPrice(scan.nextDouble());
		System.out.print("Enter category : ");
		book.setCategory(scan.next());
		
		try {
			bookService.add(book);
			System.out.println("book added succesfully");
		} catch(LibraryException excep) {
			System.err.println("Error: " + excep.getMessage());
		}
	}
	
	private static void doList() {
		try {
			List<Book> books = bookService.listAll();
			if (books == null || books.isEmpty()) {
				System.out.println("No books found");
			} else {
				for(Book book : books) {
					System.out.println(book.getBookCode() + "\t" + book.getTitle() + "\t" + book.getPrice() + "\t" + book.getCategory());
				}
			}
		} catch(LibraryException excep) {
			System.err.println("Error: " + excep.getMessage());
		}
	}
	
	private static void doDelete() {
		System.out.print("Enter book code:");
		int bookCode = scan.nextInt();
		try {
			bookService.remove(bookCode);
			System.out.println("Book deleted!");
		} catch(LibraryException excep) {
			System.err.println("Error: " + excep.getMessage());
		}
	}
	
	
}
