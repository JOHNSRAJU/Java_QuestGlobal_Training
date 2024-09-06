package multimediaLibrary;

public class Video extends MediaContent{

	@Override
	double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return days*20;
	}
	
}
