/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unit_testing.Book;

/**
 * @author angela
 *
 */
class BookTest {
	
	//test data
	String ISBNValid, ISBNInvalid, authorValid, authorInvalid, titleValid, titleInvalid;
	Book book;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		book = new Book();
		ISBNValid = "ISBNValidN";
		ISBNInvalid = "ISBNInValidN";
		authorValid = "authorValid";
		authorInvalid = "";
		titleValid = "titleValid";
		titleInvalid = "";
		
	}
	
	/**
	 * test method for constructor with valid arguments
	 */
	@Test
	public void testConstructorValid() {
		book = new Book(ISBNValid, authorValid, titleValid);
		assertEquals(ISBNValid, book.getISBN());
		assertEquals(authorValid, book.getAuthor());
		assertEquals(titleValid, book.getTitle());
		
		
	}
	
	/**
	 * test method for constructor with invalid arguments
	 */
	@Test
	public void testConstructorInValid() {
		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBNInvalid, authorValid, titleValid);
		});
		assertEquals("invalid ISBN", exception1.getMessage()); 
		
		IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBNValid, authorInvalid, titleValid);
		});
		assertEquals("invalid author", exception2.getMessage());
		
		IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBNValid, authorValid, titleInvalid);
		});
		assertEquals("invalid title", exception3.getMessage());
	}

	/**
	 * Test method for valid ISBN
	 */
	@Test
	public void testValidISBN() {
		book.setISBN(ISBNValid);
		assertEquals(ISBNValid, book.getISBN());
	
	}
	
	/**
	 * Test method for invalid ISBN
	 */
	@Test
	public void testInvalidISBN() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNInvalid);
		});
		assertEquals("invalid ISBN", exception.getMessage());
	}

	/**
	 * Test method for valid author
	 */
	@Test
	public void testValidAuthor() {
		book.setAuthor(authorValid);
		assertEquals(authorValid, book.getAuthor());
	}

	/**
	 * Test method for invalid author
	 */
	@Test
	public void testInvalidAuthor() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorInvalid);
		});
		assertEquals("invalid author", exception.getMessage());
	}

	/**
	 * Test method for valid title
	 */
	@Test
	public void testValidTitle() {
		book.setTitle(titleValid);
		assertEquals(titleValid, book.getTitle());
	}

	/**
	 * Test method for invalid title
	 */
	@Test
	public void tesInvalidTitle() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setTitle(titleInvalid);
		});
		assertEquals("invalid title", exception.getMessage());
	}

}
