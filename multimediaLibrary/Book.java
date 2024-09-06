package multimediaLibrary;
public class Book extends MediaContent{

	@Override
	double calculateRentalCost(int days) {
		return days*10;
		
	}

}
