package logisticMangementSystem;
public class International extends PackageType{

	@Override
	int getDeliveryTime() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	double getExtraRate() {
		return 0.3;
	}

}
