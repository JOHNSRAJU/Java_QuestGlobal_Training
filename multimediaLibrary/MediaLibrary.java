package multimediaLibrary;
public class MediaLibrary {
	void displayContentDetails(int contentId) {
		System.out.println("Showing basic details with content Id -"+contentId);
	}
	void displayContentDetails(int contentId,int userId) {
		System.out.println("Showing basic details with content Id -"+contentId +" and userId - "+userId);
	}
	void displayContentDetails(int contentId, int userId, int duration, MediaContent content) {
		System.out.println("Showing basic details with content Id -"+contentId +" and userId - "+userId);
		System.out.println("Cost - "+content.calculateRentalCost(duration));;
	}
}
