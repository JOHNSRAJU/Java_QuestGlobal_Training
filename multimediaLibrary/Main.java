package multimediaLibrary;
public class Main {

	public static void main(String[] args) {
		MediaContent content1 = new Book();
		MediaContent content2 = new Music();
		MediaContent content3 = new Video();
		
		MediaLibrary  library = new MediaLibrary();
		library.displayContentDetails(1);
		library.displayContentDetails(3,5);
		library.displayContentDetails(2,4,5,content1);

	}

}
