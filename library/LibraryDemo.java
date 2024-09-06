package library;
public class LibraryDemo {
	public static void main(String[] args) {
		Book book = new Book("Gulliver's Travel","001", "Oliver Twist", 225);
		Magazine magazine = new Magazine("Manorama", "0024", 5, "14/06/2024");
		book.getDetails();
		book.getDetails(true);
		
		magazine.getDetails();
		book.getDetails();
		
		magazine.updatePublicationDate("05/04/2024");

	}

}
