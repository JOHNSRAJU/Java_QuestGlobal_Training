package library;
class LibraryItem {
	public String getTitle() {
		return title;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	protected String title;
	protected String uniqueID;
	LibraryItem() {
		this.title="Unknown";
		this.uniqueID="0000";
	}
	LibraryItem(String title,String uniqueID){
		this.title = title;
		this.title = uniqueID;
	}
	public void getDetails(){
		System.out.println("Title - "+this.title);
		System.out.println("ID - "+this.uniqueID);
	}
}
