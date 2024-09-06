package library;

public class Magazine extends LibraryItem{
	private int issueNumber;
	private String publicationDate;
	public Magazine(String title, String uniqueID, int issueNumber,String publicationDate) {
		super.title=title;
		super.uniqueID=uniqueID;
		this.issueNumber=issueNumber;
		this.publicationDate=publicationDate;
	}
	public void getDetails(){
		System.out.println("Issue Number - "+this.issueNumber);
		System.out.println("Publication Date - "+this.publicationDate);
	}
	public void updatePublicationDate(String newDate) {
		this.publicationDate=newDate;
	}
}
