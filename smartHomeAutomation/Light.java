package smartHomeAutomation;
public class Light extends SmartDevice{

	public Light(int deviceId) {
		super(deviceId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void opertor(String command, int setting, String optional) {
		// TODO Auto-generated method stub
		if(command!=null) {
			super.command=command;
		}	
	}
}
