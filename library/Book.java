package library;
public class Book extends LibraryItem{
	private String author;
	private int numberOfPages;
	public Book(String title, String uniqueID, String author,int numberOfPages) {
		super.title=title;
		super.uniqueID=uniqueID;
		this.author=author;
		this.numberOfPages=numberOfPages;
	}
	public void getDetails(boolean includeAuthor) {
		System.out.println("Title - "+super.title);
		System.out.println("ID - "+super.uniqueID);
		System.out.println("Author - "+this.author);
		System.out.println("Number of Pages - "+this.numberOfPages);
	}
	public void getDetails() {
		System.out.println("Author - "+this.author);
		System.out.println("Number of Pages - "+this.numberOfPages);
	}
}
