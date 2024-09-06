package logisticMangementSystem;
public class Express extends PackageType{

	@Override
	int getDeliveryTime() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	double getExtraRate() {
		// TODO Auto-generated method stub
		return 0.1;
	}

}
