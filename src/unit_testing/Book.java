/**
 * 
 */
package unit_testing;

/**
 * Book class - represents a book in the system
 * 
 * @author angela
 *
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	
	public Book(String ISBN, String author,String title) {
		this.setISBN(ISBN);
		this.setAuthor(author);
		this.setTitle(title);
		
	}
	
	/**
	 * Default constructor
	 */
	public Book() {

	}
	
	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN 10 or 13 chars
	 * @throws Exception
	 */
	public void setISBN(String iSBN) {
		if (iSBN.length()==10 || iSBN.length()==13) {
			this.ISBN = iSBN;
		}else {
			throw new IllegalArgumentException("invalid ISBN");
		}

	

	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		if (author.length()>1) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("invalid author");
		}
		

	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 */
	public void setTitle(String title){
		if (title.length()>1) {
			this.title = title;
		}else {
			throw new IllegalArgumentException("invalid title");
		}
		

	}

	

}
