package multimediaLibrary;
public class Music extends MediaContent{

	@Override
	double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return days*12;
	}

}
