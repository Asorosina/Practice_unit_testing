package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unit_testing.Book;
import unit_testing.Library;

public class LibraryTest {
	//test data
	String ISBN1, author1, title1;
	String ISBN2, author2, title2;
	Book book1;
	Book book2;
	Book book3;
	
	ArrayList<Book> books;

	@BeforeEach
	public void setUp() throws Exception {
		ISBN1 = "ISBNValid1";
		ISBN2 = "ISBNValid2";
		author1 = "author1";
		title1 = "title1";
		ISBN2 = "ISBNValid2";
		author2 = "author2";
		title2 = "title2";
		
		book1 = new Book(ISBN1, author1, title1);
		book2 = new Book(ISBN2, author2, title2);
		book3 = new Book(ISBN2, author2, title2);
		
		books = new ArrayList<Book>();
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
	}

	@Test
	public void testSearchByTitle() {
		
		ArrayList<Book> results = Library.searchByTitle(books, title1);
		if (results.contains(book1)) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}

	@Test
	public void testSearchByAuthor() {
		ArrayList<Book> results = Library.searchByAuthor(books, author2);
		if ((results.contains(book2)) && (results.contains(book3))) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}

}
